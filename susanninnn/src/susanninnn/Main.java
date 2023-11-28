package susanninnn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua idade");
		int idade = sc.nextInt();

		while (idade < 18) {
			System.out.println("Você ainda é de menor, precisa comer mais feijão");
			System.out.println("Insira sua idade novamente");
			idade = sc.nextInt();
		}
		System.out.println("Você é de maior agora!");
		// teste git
		sc.close();
	}

}
