package exercises.complete.OrderSummary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {
	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.printf("Informações do cliente:%nName: ");
		String name = sc.nextLine();
		
		System.out.print("Email?: ");
		String email = sc.next();
		
		System.out.print("Birth date: (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		
		Order order = new Order(new Date(), new Client(name, email, birthdate));
		System.out.printf("Entre com o pedido: %nStatus: ");
		order.setStatus(OrderStatus.valueOf(sc.next()));
		
		System.out.println("Quantos pedidos para registar? ");
		int quantidade = sc.nextInt();
		
		for (int i=1; i<=quantidade;i++) {
			System.out.printf("Item #" + i +": %nNome do Produto: ");
			String nomeproduto = sc.next();
			
			System.out.print("Preço do produto: ");
			Double precoproduto = sc.nextDouble();
			System.out.print("Quantidade do produto ");
			int quantidadeproduto = sc.nextInt();
			order.addItem(new OrderItem(quantidadeproduto, new Product(nomeproduto, precoproduto)));
		
		}	
			
		order.informacaoPedido();
		
		
		
		
		
		
		
		sc.close();
	}

}
