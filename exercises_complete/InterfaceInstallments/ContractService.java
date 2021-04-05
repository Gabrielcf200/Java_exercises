package exercises_complete.InterfaceInstallments;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
	private PagamentoOnlineService pagamentoOnline;
	
	public ContractService(PagamentoOnlineService pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}


	public void ProcessamentoParcelamento(Contrato contrato, Integer month) {
		double valueInicial = contrato.getValueContrato() / month;
		for(int i=1;i<=month;i++) {
			Double valor = pagamentoOnline.parcelamento(valueInicial,i);
			valor += pagamentoOnline.pagamento((valor + valueInicial));
			valor = valor + valueInicial;
			Date date = addMonths(contrato.getDateContrato(), i);
			contrato.getParcelamento().add(new Parcelamento(date, valor));
			}
		}
	
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}