package snakeandladder.com;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame2 {
    private static final int BOARD_SIZE = 100;
    private static final int WINNING_POSITION = 100;
    private static final int[] SNAKE_POSITIONS = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
    private static final int[] SNAKE_DESTINATIONS = {6, 26, 11, 53, 19, 60, 24, 73, 75, 78};
    private static final int[] LADDER_POSITIONS = {1, 4, 9, 21, 28, 36, 51, 71, 80};
    private static final int[] LADDER_DESTINATIONS = {38, 14, 31, 42, 84, 44, 67, 91, 100};

    private int currentPlayerPosition;
    private Random random;
    private Scanner scanner;

    public SnakeAndLadderGame2() {
        this.currentPlayerPosition = 0;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    private void playGame() {
        System.out.println("Snake and Ladder Game!");

        while (currentPlayerPosition < WINNING_POSITION) {
            System.out.println("Player " + (currentPlayerPosition % 2 + 1) + "'s turn. Press enter to roll the dice.");
            scanner.nextLine();

            int diceRoll = rollDice();
            System.out.println("Player " + (currentPlayerPosition % 2 + 1) + " rolled a " + diceRoll + ".");

            if (currentPlayerPosition + diceRoll <= BOARD_SIZE) {
                currentPlayerPosition += diceRoll;
                currentPlayerPosition = applySnakeOrLadder(currentPlayerPosition);
            }

            System.out.println("Player " + (currentPlayerPosition % 2 + 1) + " is now at position " + currentPlayerPosition + ".");

            if (currentPlayerPosition == WINNING_POSITION) {
                System.out.println("Player " + (currentPlayerPosition % 2 + 1) + " wins!");
                break;
            }
        }
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    private int applySnakeOrLadder(int position) {
        for (int i = 0; i < SNAKE_POSITIONS.length; i++) {
            if (position == SNAKE_POSITIONS[i]) {
                System.out.println("Oh no! Snake at position " + position + " bit you.");
                return SNAKE_DESTINATIONS[i];
            }
        }

        for (int i = 0; i < LADDER_POSITIONS.length; i++) {
            if (position == LADDER_POSITIONS[i]) {
                System.out.println("Hooray! Found a ladder at position " + position + ".");
                return LADDER_DESTINATIONS[i];
            }
        }

        return position;
    }

    public static void main(String[] args) {
        SnakeAndLadderGame2 game = new SnakeAndLadderGame2();
        game.playGame();
    }
}
