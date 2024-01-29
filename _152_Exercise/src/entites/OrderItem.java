package entites;

public class OrderItem {

	private Integer quantity;
	private Product product;
	
	public OrderItem(Product product, Integer quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", product.getName(), product.getPrice(), quantity, subTotal());
	}
	
	public Double subTotal() {
		return quantity * product.getPrice();
	}
}
