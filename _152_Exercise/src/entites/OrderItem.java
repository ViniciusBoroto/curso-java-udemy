package entites;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	public OrderItem(Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", )
	}
	
	public Double subTotal() {
		return quantity * price;
	}
}
