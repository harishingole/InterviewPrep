package com.java;
//Write a SQL query to get total annual salary more than 1CR departments-wise, for people in range of age 30 to 35 and gender male
//Table: Employee (Fields - id, name, age, dob, gender, doj, department, salary)

public class RotateArray {


	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int d = 2;
		rotateLeft(arr,d);
		
	}

	private static void rotateLeft(int[] arr, int d) {
		int [] rotatedArr = new int[arr.length];
		int rotation = d;
		int i = 0;
		while(rotation < arr.length) {
			rotatedArr[i] = arr[rotation];
			i++;
			rotation++;
		}
		rotation = 0;
		while(rotation < d) {
			rotatedArr[i] = arr[rotation];
			i++;
			rotation++;
		}
		
		for (int j = 0; j < rotatedArr.length; j++) {
			System.out.print(rotatedArr[j]);
		}
		
	}
}
