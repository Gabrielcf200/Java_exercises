package exercises_complete.InterfaceInstallments;

public class Paypal implements PagamentoOnlineService{
	private static final double MONTHLY_INTEREST = 0.01;
	private static final double PAYMENTEFEE= 0.02;
	
	
	@Override
	public double pagamento(Double amount) {
		return amount * PAYMENTEFEE;
	}
	@Override
	public double parcelamento(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}

}
