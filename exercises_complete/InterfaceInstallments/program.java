package exercises_complete.InterfaceInstallments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.printf("Enter contract data%nNumber: ");
		Integer nContrato = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date dateContrato = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double valueContrato = sc.nextDouble();
		Contrato contrato = new Contrato(nContrato, dateContrato, valueContrato);
		
		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();
		
		ContractService cf = new ContractService(new Paypal());
		cf.ProcessamentoParcelamento(contrato, months);
		
		System.out.println("Installments: ");
		for (int i=0;i<months;i++) {
			System.out.println(sdf.format(contrato.getParcelamento().get(i).getDueDate()) + " - " + contrato.getParcelamento().get(i).getAmount());
		}
		
		
		sc.close();
	}
}
