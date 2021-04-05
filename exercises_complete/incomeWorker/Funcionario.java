package exercises_complete.incomeWorker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Funcionario {
	private String name;
	private Categoria categoria ;
	private Double baseSalary;
	private Departamento departamento;
	private List<HourContract> contracts = new ArrayList<>();

	public Funcionario() {
	}
	public Funcionario(String name, Categoria level, Double baseSalary) {
		this.name = name;
		this.categoria = level;
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public double income(int ano, int mes) {
		Calendar cal = Calendar.getInstance();
		double sum = baseSalary;
		for (HourContract c: contracts) {
			cal.setTime((Date) c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if (c_ano == ano && mes == c_mes) {
				sum += c.totalValue(); 
			}
		} return sum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(String level) {
		Categoria categoria =  Categoria.valueOf(level);
		this.categoria = categoria;
	}
	
	
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	public String getDepartamento() {
		return departamento.getName();
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = new Departamento(departamento);		
	
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	
	
	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", categoria=" + categoria + ", baseSalary=" + baseSalary
				+ ", departamento=" + departamento.getName() + "]";
	}
	
	public static void main(String[] args) {
		
		
	}




}

