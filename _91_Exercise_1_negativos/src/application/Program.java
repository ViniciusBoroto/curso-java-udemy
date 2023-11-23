package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int[] numList = new int[sc.nextInt()];
		
		for (int i=0; i < numList.length; i++) {
			System.out.println("Digite um numero: ");
			numList[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] < 0) {
				System.out.println(numList[i]);
			}
		}
		
		sc.close();
	}

}
