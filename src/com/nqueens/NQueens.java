package com.nqueens;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		System.out.println(n);
		new NQueens().puzzle(n);
		sc.close();
	}

	private void puzzle(int n) {
		int[][] chessBoard = new int[4][4];
		toCheckNoQueensAttack(chessBoard);
	}

	private void toCheckNoQueensAttack(int[][] chessBoard) {
		for (int i = 0; i < chessBoard.length; i++) {
			
		}
	}
}
