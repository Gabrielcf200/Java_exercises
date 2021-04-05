package exercises_complete.ReaderWriteProduct;


public class Product {
	private Integer quantity = null;
	private Double price= null;
	private String name= null;
	
	public Product(Integer quantity, Double price, String name) {
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Double total() {
		return quantity * price;
	}

}
