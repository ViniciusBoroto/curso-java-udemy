package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char r = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch (r) {
				case 'i':
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFee));
					break;
				case 'u':
					System.out.println("Manufacture date (DD/MM/YYYY): ");
					sc.nextLine();
					Date ManufacturingDate = sdf.parse(sc.nextLine());
					products.add(new UsedProduct(name, price, ManufacturingDate));
					break;
				default:
					products.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}

}
