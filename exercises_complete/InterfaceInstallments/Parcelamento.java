package exercises_complete.InterfaceInstallments;

import java.util.Date;

public class Parcelamento {
	private Date dueDate;
	private Double amount;
	
	public Parcelamento(Date dueDate, Double amount) {
		this.dueDate = dueDate;
	}
	
	
	
	
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	


}
