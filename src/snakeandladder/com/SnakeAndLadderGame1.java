package snakeandladder.com;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame1 {
    private static final int WINNING_POSITION = 100;
    private static final Map<Integer, Integer> snakes;
    private static final Map<Integer, Integer> ladders;
    private static final Random random = new Random();

    static {
        snakes = new HashMap<>();
        snakes.put(32, 10);
        snakes.put(36, 6);
        snakes.put(48, 26);
        snakes.put(62, 18);
        snakes.put(88, 24);
        snakes.put(95, 56);
        snakes.put(97, 78);

        ladders = new HashMap<>();
        ladders.put(1, 38);
        ladders.put(4, 14);
        ladders.put(8, 30);
        ladders.put(21, 42);
        ladders.put(28, 76);
        ladders.put(50, 67);
        ladders.put(71, 92);
        ladders.put(80, 99);
    }

    public static void main(String[] args) {
        int currentPlayer = 1;
        
        int[] playerPositions = {0, 0}; // positions of players, 0th index represents player 1, and 1st index represents player 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snake and Ladder Game!");

        while (true) {
            System.out.println("\nPlayer " + currentPlayer + "'s turn. Press enter to roll the dice...");
            scanner.nextLine();

            int diceValue = rollDice();
            
            System.out.println("Player " + currentPlayer + " rolled a " + diceValue);

            playerPositions[currentPlayer - 1] += diceValue;
            if (playerPositions[currentPlayer - 1] > WINNING_POSITION) {
                playerPositions[currentPlayer - 1] -= diceValue;
            } else {
                System.out.println("Player " + currentPlayer + " moved to position " + playerPositions[currentPlayer - 1]);
                playerPositions[currentPlayer - 1] = getNewPositionAfterSnakeOrLadder(playerPositions[currentPlayer - 1]);
                System.out.println("After applying snake or ladder, player " + currentPlayer + " moved to position " + playerPositions[currentPlayer - 1]);
            }

            if (playerPositions[currentPlayer - 1] == WINNING_POSITION) {
                System.out.println("\nPlayer " + currentPlayer + " wins!");
                break;
            }

            currentPlayer = currentPlayer % 2 + 1; // Switch to the next player
        }
    }

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    private static int getNewPositionAfterSnakeOrLadder(int currentPosition) {
        if (snakes.containsKey(currentPosition)) {
            System.out.println("Oops! Snake bite!");
            return snakes.get(currentPosition);
        } else if (ladders.containsKey(currentPosition)) {
            System.out.println("Yay! Found a ladder!");
            return ladders.get(currentPosition);
        }
        return currentPosition;
    }
}
