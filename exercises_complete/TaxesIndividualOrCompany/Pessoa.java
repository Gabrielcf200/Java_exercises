package exercises_complete.TaxesIndividualOrCompany;

import java.util.List;

public abstract class Pessoa {
		private String nome;
		private Double rendaanual;
		
		public Pessoa(String nome, Double rendaanual) {
			this.nome = nome;
			this.rendaanual =rendaanual;			
		}

		
		public abstract Double calImposto();
		
		public Double totalImposto(List<Pessoa> p) {
			Double sum = 0.0;
			for (Pessoa pessoa: p) {
				sum += pessoa.calImposto();
			}return sum;
		}
			
		
		public void taxesPaid() {
			System.out.printf(getNome() + ": $ " + String.format("%.2f%n", calImposto()));
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getRendaAnual() {
			return rendaanual;
		}

		public void setRendaAnual(Double rendaanual) {
			this.rendaanual = rendaanual;
		}
		
		
}

