package exercises_complete.ListEmployeeIncrease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		int x, id, porcentagem;
		double salario;
		String nome;
		
		List<Employee> emplyoeeList = new ArrayList<>();
	
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		
		for (int i=0; i < x;i++) {
			System.out.println("Employoee #" + (i+1) );
			System.out.print("id: ");
			id = sc.nextInt();
			System.out.print("nome: ");
			nome = sc.next();
			System.out.print("Salário: ");
			salario = sc.nextDouble();
			
			Employee funcionario = new Employee(id, nome, salario);
			emplyoeeList.add(funcionario);				
		}	
		
		System.out.println("Qual funcionário você deseja aumentar o salário? ");
		id = sc.nextInt();
		x = procuraID(emplyoeeList, id);
		if ( x == -1) {
			System.out.println("Funcionário não encontrado!");
		}
		else {
			System.out.println("Entre com a porcentagem do aumento: ");
			porcentagem = sc.nextInt();
			((Employee) emplyoeeList.get(x)).AumentoSalario(porcentagem);
		}
		
		printList(emplyoeeList);
		sc.close();
		
		
		
		
	}
	
	
	public static int procuraID(List<Employee> emplyoeeList, int id) {
		for (int i=0; i < emplyoeeList.size();i++) {
			if (emplyoeeList.get(i).getId() == id) {
				return i;	
			}
		}
		return -1;
	}
	public static void printList(List<Employee> emplyoeeList) {
		for (int i=0; i < emplyoeeList.size();i++) {
			System.out.printf(emplyoeeList.get(i).toString());
		}
		
	
	}
}
