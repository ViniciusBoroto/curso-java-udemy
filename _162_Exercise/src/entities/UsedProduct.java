package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	public final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date manufactureDate;

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f (Manufacture date: ", name, price) + sdf.format(manufactureDate) + ")";
	}
}
