package exercises_complete.PolymorphismPayment;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + (additionalCharge * 1.1);
	}
	
	public String toString() {
		return super.getName() + " - $ " + payment();
	}
}