package exercises_complete.BoughtDollarReais;

public class ContadorDolar {
	public static final double IOF = 0.06;
	
	public static double ContadoraDolar(double a, double b) {
		return (a * b * IOF) +(a * b);
	}

}
