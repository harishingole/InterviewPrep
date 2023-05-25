package snakeandladder.com;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadderGame {
    private static final int BOARD_SIZE = 100; // Size of the board
    private static final int[] MOVES = new int[BOARD_SIZE + 1]; // Stores the ladder or snake moves

    // Class representing a state on the board
    private static class BoardState {
        int position; // Current position on the board
        int diceRolls; // Number of dice rolls to reach this position

        public BoardState(int position, int diceRolls) {
            this.position = position;
            this.diceRolls = diceRolls;
        }
    }

    public static int getMinDiceRolls() {
        // Initialize moves array with default values
        for (int i = 1; i <= BOARD_SIZE; i++) {
            MOVES[i] = i;
        }

        // Define ladder moves
        MOVES[1] = 38;
        MOVES[4] = 14;
        MOVES[9] = 31;
        MOVES[21] = 42;
        MOVES[28] = 84;
        MOVES[36] = 44;
        MOVES[51] = 67;
        MOVES[71] = 91;
        MOVES[80] = 100;

        // Define snake moves
        MOVES[16] = 6;
        MOVES[47] = 26;
        MOVES[49] = 11;
        MOVES[56] = 53;
        MOVES[62] = 19;
        MOVES[64] = 60;
        MOVES[87] = 24;
        MOVES[93] = 73;
        MOVES[95] = 75;
        MOVES[98] = 78;

        // Perform Breadth-First Search to find the minimum number of dice rolls to reach the final position
        boolean[] visited = new boolean[BOARD_SIZE + 1];
        Queue<BoardState> queue = new LinkedList<>();
        visited[1] = true;
        queue.add(new BoardState(1, 0));

        while (!queue.isEmpty()) {
            BoardState currentState = queue.poll();
            int currentPosition = currentState.position;
            int currentDiceRolls = currentState.diceRolls;

            if (currentPosition == BOARD_SIZE) {
                return currentDiceRolls;
            }

            // Roll the dice from 1 to 6
            for (int diceValue = 1; diceValue <= 6; diceValue++) {
                int nextPosition = currentPosition + diceValue;

                if (nextPosition <= BOARD_SIZE && !visited[nextPosition]) {
                    visited[nextPosition] = true;

                    // Check if there is a snake or ladder at the next position
                    if (MOVES[nextPosition] != nextPosition) {
                        nextPosition = MOVES[nextPosition];
                    }

                    queue.add(new BoardState(nextPosition, currentDiceRolls + 1));
                }
            }
        }

        // If the final position is unreachable
        return -1;
    }

    public static void main(String[] args) {
        int minDiceRolls = getMinDiceRolls();

        if (minDiceRolls != -1) {
            System.out.println("Minimum number of dice rolls to reach the final position: " + minDiceRolls);
        } else {
            System.out.println("The final position is unreachable.");
        }
    }
}
