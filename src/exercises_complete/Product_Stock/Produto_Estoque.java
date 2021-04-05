package exercises_complete.Product_Stock;

public class Produto_Estoque {

	 public String name;
	 public  double price;
	 public int quantity;
	

		
	public int AddProducts(int x) {
		
		return this.quantity += x;
	}
	public int RemoveProducts(int x) {
	
		return this.quantity -= x;
	}
	public double TotalValueInStock() {
		return quantity * price;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ price
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ TotalValueInStock();
	}
}
