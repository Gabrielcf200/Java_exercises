package exercises_complete.TaxesIndividualOrCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Pessoa> listPessoa = new ArrayList<>();
		
		System.out.println("Entre com o número de pessoas: ");
		int np = sc.nextInt();
		
		for (int i=1; i<=np;i++) {
			System.out.println("Pessoa #" + i + " informações: ");
			System.out.print("Pessoa física ou jurídica (F/J): ");
			String x = sc.next();
			char fj = x.toLowerCase().charAt(0);
			
			if (fj == 'f') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Renda Anual: ");
				Double rendaanual = sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				Double gastosaude = sc.nextDouble();
				System.out.printf("%n");
				
				listPessoa.add(new Pessoa_Fisica(name, rendaanual, gastosaude));
			
			}else if (fj == 'j') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Renda Anual: ");
				Double rendaanual = sc.nextDouble();
				System.out.print("Número de funcionários: ");
				Integer nfuncionario = sc.nextInt();
				System.out.printf("%n");
				
				listPessoa.add(new Pessoa_Juridica(name, rendaanual, nfuncionario));
			
			} else {System.out.println("ERRO"); System.exit(0);}
		}
		System.out.printf("IMPOSTOS: %n");
			for (Pessoa pessoa: listPessoa) {
			pessoa.taxesPaid();
		}
		
			System.out.println("IMPOSTO TOTAL: " + 
			String.format("%.2f%n", listPessoa.get(0).totalImposto(listPessoa)));
		
			sc.close();
	}

}
