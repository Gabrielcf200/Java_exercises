package exercises_complete.InterfaceInstallments;

public interface PagamentoOnlineService {
	
	double pagamento(Double amount);
	double parcelamento(double amount, int months);

}
