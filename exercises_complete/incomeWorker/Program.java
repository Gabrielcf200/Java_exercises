package exercises_complete.incomeWorker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) throws ParseException {
		Integer x,hora, mes, ano;
		String name, categoria,  mesano, departamento;
		Date data;
		double baseSalary, valorhora;
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Entre com o nome do departamento: ");
		departamento = sc.nextLine();
		
		System.out.printf("Dados do funcionário:%nName: ");
		name = sc.nextLine();
		
		System.out.print("Categoria: ");
		categoria = sc.nextLine();
		
		System.out.print("Base salarial: ");
		baseSalary = sc.nextDouble();
		
		Funcionario f1 = new Funcionario(name, Categoria.valueOf(categoria), baseSalary);
		f1.setDepartamento(departamento);
		
		
		System.out.println("Quantos contrados o funcionário tem? ");
		x = sc.nextInt();
		
		for (int i=1;i<=x;i++) {
			System.out.println("Entre com o contrato #"+ i +": ");
			System.out.print("Data (DD/MM/YYYY): ");
			data =sdf1.parse(sc.next());
			
			System.out.println("Valor por hora: ");
			valorhora = sc.nextDouble();
			
			System.out.println("Duração (horas): ");
			hora = sc.nextInt();
			
			HourContract contract = new HourContract(data, valorhora, hora);
			
			f1.addContract(contract);
		}
		
	
		
		
		
		System.out.printf("%n%nEntre com o mês e ano para calcular o salário: ");
		mesano = sc.next();
		mes = Integer.parseInt(mesano.substring(0, 2));
		ano = Integer.parseInt(mesano.substring(3));
		
		
		
		System.out.println("Name: " + f1.getName());
		System.out.println("Departamento: " + f1.getDepartamento());
		System.out.println("Renda em " + mes + "/" + ano + ": " + f1.income(ano, mes));
		
		
		
		
		sc.close();
	}
	
	
}
