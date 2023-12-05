package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		String clientEmail = sc.nextLine();
		Date clientBirth = new Date();
		
		Client client = new Client(clientName, clientEmail, clientBirth);
		
		System.out.println("Enter Order data:");
		System.out.println("Status: ");
		String status = sc.nextLine();
		System.out.println("How many items to this order? ");
//		Para cada produto, criar um novo produto e um order item
//			perguntar os atributos 
//		Adicionar 
		Order order = new Order(new Date(), status, client);
		
		
		int productQty = sc.nextInt();
		for (int i = 0; i<productQty; i++) {
			System.out.println("Enter the #" + i+1 + " item data: ");
			System.out.println("Product name: ");
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int qty = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem order = new OrderItem(qty, product);
		}

		
				
	sc.close();
	}

}
