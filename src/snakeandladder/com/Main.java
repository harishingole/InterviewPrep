package snakeandladder.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Player {
    private final String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

class Board {
    private static final Map<Integer, Integer> snakes;
    private static final Map<Integer, Integer> ladders;

    static {
        snakes = new HashMap<>();
        snakes.put(16, 6);
        snakes.put(47, 26);
        snakes.put(49, 11);
        snakes.put(56, 53);
        snakes.put(62, 19);
        snakes.put(64, 60);
        snakes.put(87, 24);
        snakes.put(93, 73);
        snakes.put(95, 75);
        snakes.put(98, 78);

        ladders = new HashMap<>();
        ladders.put(1, 38);
        ladders.put(4, 14);
        ladders.put(9, 31);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(80, 100);
    }

    public static int applySnakeOrLadder(int position) {
        if (snakes.containsKey(position)) {
            System.out.println("Oops! Snake bite!");
            return snakes.get(position);
        } else if (ladders.containsKey(position)) {
            System.out.println("Yay! Found a ladder!");
            return ladders.get(position);
        }
        return position;
    }
}

class Game {
    private static final int WINNING_POSITION = 100;
    private final Player[] players;
    private final int playerCount;
    private final Random random;

    public Game(int playerCount) {
        this.playerCount = playerCount;
        players = new Player[playerCount];
        random = new Random();
    }

    public void initializePlayers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < playerCount; i++) {
            System.out.print("Enter name for Player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }
    }

    public void play() {
        int currentPlayer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snake and Ladder Game!");

        while (true) {
            Player player = players[currentPlayer];
            System.out.println("\n" + player.getName() + "'s turn. Press enter to roll the dice...");
            scanner.nextLine();

            int diceValue = rollDice();
            System.out.println(player.getName() + " rolled a " + diceValue);

            int newPosition = player.getPosition() + diceValue;
            if (newPosition <= WINNING_POSITION) {
                player.setPosition(Board.applySnakeOrLadder(newPosition));
                System.out.println(player.getName() + " moved to position " + player.getPosition());
            }

            if (player.getPosition() == WINNING_POSITION) {
                System.out.println("\n" + player.getName() + " wins!");
                break;
            }

            currentPlayer = (currentPlayer + 1) % playerCount;
        }
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        Game game = new Game(playerCount);
        game.initializePlayers();
        game.play();
    }
}
