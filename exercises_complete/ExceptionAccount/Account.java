package exercises_complete.ExceptionAccount;

public class Account {
	private Integer accountNumber; 
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account(Integer accountNumber, String holder, Double balance, Double withdrawLimit) {
		this.setAccountNumber(accountNumber);
		this.setHolder(holder);
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Double getBalance() {
		return  this.balance;
	}
	public void deposit(Double amount) {
		this.balance +=  amount;
	}
	public void withdraw(Double amount) throws AccountException {
		
		if(amount > this.withdrawLimit){
			throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
				
		}else if(this.balance == 0 || (this.balance - amount) < 0 ) {
			throw new AccountException("Withdraw error: Not enought balance");
			
		}
		this.balance -= amount;
	}
	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f%n", this.balance);
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
}
