import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();

		System.out.println("Insira sua idade");
		if (idade > 18) {
			System.out.println("É de maior!!");
		}
		else {
			System.out.println("É de menor!!");
		}
		
		
		sc.close();
	}
}