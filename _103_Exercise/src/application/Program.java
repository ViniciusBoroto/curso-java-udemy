package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rowsQty = sc.nextInt();
		int columnsQty = sc.nextInt();

		int[][] matrix = new int[rowsQty][columnsQty];

		System.out.println("Insert the matrix numbers: ");
		for (int i = 0; i < rowsQty; i++) {
			for (int j = 0; j < columnsQty; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Now insert a number that is on the matrix");
		int numberToFetch = sc.nextInt();
		
		System.out.println("Insert the matrix numbers: ");
		for (int i = 0; i < rowsQty; i++) {
			for (int j = 0; j < columnsQty; j++) {
				if (matrix[i][j] == numberToFetch) {
					System.out.printf("Position %d, %d: %n", i, j);
//					 LEFT
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
//					UP
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
//					RIGHT
					if (j < columnsQty - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
//					DOWN
					if (i < rowsQty - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}
