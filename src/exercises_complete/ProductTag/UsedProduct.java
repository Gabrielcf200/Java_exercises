package exercises_complete.ProductTag;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(String name, Double price, Date manufactureData) {
		super(name, price);
		this.manufactureDate = manufactureData;
	}

	
	public void priceTag() {
		System.out.printf(getName() + " (Used) "+" $ " + getPrice() + 
				" (Manufacture date: " + sdf.format(getManufactureDate()) + ")%n");
	}


	public Date getManufactureDate() {
		return manufactureDate;
	}
}
