package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Client client;
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orders = new ArrayList<>();
	
	public Order(Client client, Date moment, String status) {
		this.client = client;
		this.moment = moment;
		this.status = OrderStatus.valueOf(status);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrders() {
		return orders;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf2.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		Double sum = 0.00;
		for (OrderItem orderItem : orders ) {
			sb.append(orderItem.toString() + "\n");
			sum += orderItem.subTotal();
		}
		sb.append(String.format("Total price: $%.2f", sum));
		
		return sb.toString();
		
	}
	
	public void addItem(OrderItem item) {
		orders.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orders.remove(item);
	}
	
	public Double total() {
		Double sum = 0.00;
		for (OrderItem item : orders) {
			sum += item.subTotal();
		}
		return sum;
	}
}
