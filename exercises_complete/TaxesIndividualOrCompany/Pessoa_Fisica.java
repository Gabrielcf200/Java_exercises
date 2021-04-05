package exercises_complete.TaxesIndividualOrCompany;

public class Pessoa_Fisica extends Pessoa{
	private Double gastosaude;
	
	public Pessoa_Fisica(String nome, Double rendaanual, Double gastosaude){
		super(nome, rendaanual);
		this.gastosaude = gastosaude;
	}

	
	
	public Double getGastosaude() {
		return gastosaude;
	}



	public void setGastosaude(Double gastosaude) {
		this.gastosaude = gastosaude;
	}



	@Override
	public Double calImposto() {
		if(super.getRendaAnual() < 20000.0) {
			if ((super.getRendaAnual() * 0.15) - (0.5 * getGastosaude()) >= 0){
				return (super.getRendaAnual() * 0.15) - (0.5 * getGastosaude());
				}else {return 0.0;}		
		}else {
			if (super.getRendaAnual() * 0.25 - (0.5 * getGastosaude()) >= 0) {
				return super.getRendaAnual() * 0.25 - (0.5 * getGastosaude());
			}else {return 0.0;}
			}
		
	}
}
