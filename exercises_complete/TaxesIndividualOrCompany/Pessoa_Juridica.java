package exercises_complete.TaxesIndividualOrCompany;

public class Pessoa_Juridica extends Pessoa{
	private Integer nfuncionario;

	public Pessoa_Juridica(String nome, Double rendaanual, Integer nfuncionario) {
		super(nome, rendaanual);
		this.nfuncionario = nfuncionario;
	}

	public Integer getNfuncionario() {
		return nfuncionario;
	}

	public void setNfuncionario(Integer nfuncionario) {
		this.nfuncionario = nfuncionario;
	}

	@Override
	public Double calImposto() {
		if(getNfuncionario() <= 10) {
			return super.getRendaAnual() * 0.16;
		} else {return super.getRendaAnual() * 0.14;}
		
	}
	

}
