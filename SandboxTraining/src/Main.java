import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números que serão somados:");
		int max = sc.nextInt();
		double soma = 0;
		
		for ( int i = 0; i < max; i++) {
			System.out.println("Insira um número para somar:");
			soma += sc.nextDouble();
		}
		System.out.println();
		System.out.println("Resultado: " + soma);
		sc.close();
	}

}
