package exercises_complete.ProductTag;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct(String name, Double price, Double customsFee ) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public void priceTag() {
		System.out.printf(getName() +" $ " + getPrice() + 
				" (Customs Fee: $" + getCustomsFee() + ")%n");
	}
	public Double getCustomsFee() {
		return customsFee;
	}
}

