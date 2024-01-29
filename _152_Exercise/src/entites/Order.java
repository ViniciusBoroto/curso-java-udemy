package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orders = new ArrayList<>();
	
	public Order(Date moment, String status) {
		super();
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
