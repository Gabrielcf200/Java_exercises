package exercises_complete.InterfaceInstallments;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer nContrato;
	private Date dateContrato;
	private Double valueContrato;
	private List<Parcelamento> list = new ArrayList<Parcelamento>();

	public Contrato(){}

	public Contrato(Integer nContrato, Date dateContrato, Double valueContrato) {
		this.nContrato = nContrato;
		this.dateContrato = dateContrato;
		this.valueContrato = valueContrato;
	}

	
	
	
	
	public List<Parcelamento> getParcelamento() {
		return list;
	}

	public Integer getnContrato() {
		return nContrato;
	}

	public void setnContrato(Integer nContrato) {
		this.nContrato = nContrato;
	}

	public Date getDateContrato() {
		return dateContrato;
	}

	public void setDateContrato(Date dateContrato) {
		this.dateContrato = dateContrato;
	}

	public Double getValueContrato() {
		return valueContrato;
	}

	public void setValueContrato(Double valueContrato) {
		this.valueContrato = valueContrato;
	}

	
	
}
