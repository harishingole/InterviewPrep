package com.snakeandladder;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {		
			System.out.println("Enter number of players");
			int playerCount = sc.nextInt();
			sc.nextLine();
			Game game = new Game(playerCount);
			game.initializePlayers();
			game.play();
		}catch(Exception e) {
			System.out.println("Invalid Input");
		}finally {
			sc.close();
		}
	}
}
