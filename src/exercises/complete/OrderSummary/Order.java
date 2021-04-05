package exercises.complete.OrderSummary;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> item = new ArrayList<>();
	private Client cliente;
	
	SimpleDateFormat sdf = new SimpleDateFormat(("dd/MM/yyyy"));
	
		
	
	public Order(Date moment, Client cliente) {

		this.moment = moment;
		this.cliente = cliente;
	}
	

	
	public Client getCliente() {
		return cliente;
	}



	public void setCliente(Client cliente) {
		this.cliente = cliente;
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
	public List<OrderItem> getItem() {
		return item;

	}
	
	public void addItem(OrderItem x) {
		item.add(x);	
	}
	public void removeItem(OrderItem x) {
		item.remove(x);	
	}
	
	
	public Double total(List<OrderItem> x){
		double sum = 0;
		for (int i=0; i < x.size(); i ++) {
			sum += x.get(i).subTotal();
		}
		return sum;
	}
	
	
	public void informacaoPedido() {
		System.out.printf("%n%nPEDIDO: %nMomento do pedido: " + sdf.format(getMoment()) + 
				"%nStatus: " + getStatus() + "%nCliente: " + 
				getCliente().getName() + " (" + sdf.format(getCliente().getDate()) + ") - " 
				+ getCliente().getEmail() + "%n%nItens do pedido: %n");
		
		
		for (int i=0; i<item.size();i++) {
			System.out.printf(item.get(i).getProduct().getName() + ", " + item.get(i).getProduct().getPrice() 
					+ ", Quantidade: " + item.get(i).getQuantity() + ", Subtotal: $" + item.get(i).subTotal() + "%n");
		}
		
		System.out.println("Total price: $" + total(item));
	}
	
	
}
