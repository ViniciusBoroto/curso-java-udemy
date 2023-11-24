package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[n];
		double[] bimester1 = new double[n];
		double[] bimester2 = new double[n];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			names[i] = sc.nextLine();
//			sc.nextLine();
			bimester1[i] = sc.nextDouble();
			bimester2[i] = sc.nextDouble();
			sc.nextLine();
		}
		 
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < names.length; i++) {
			
			if ((bimester1[i] + bimester2[i]) / 2 >= 6) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}

}
