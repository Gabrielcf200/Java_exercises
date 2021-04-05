package exercises_complete.ExceptionAccount;

public class AccountException extends Exception{
	private static final long serialVersionUID = 1L;

	public AccountException(String msg){
		super(msg);
	}
}
