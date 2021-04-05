package exercises_complete.PolymorphismPayment;


public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHour){
		this.hours = hours;
		this.name = name;
		this.valuePerHour = valuePerHour;
		
	}

	
	public Double payment() {
		return hours * valuePerHour;
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public String toString() {
		return getName() + " - $ " + payment();
	}

}
