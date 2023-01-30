package projects;

public class Atm
{
	private double balance;
	private double deposit_balance;
	private double withdraw_balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit_balance() {
		return deposit_balance;
	}
	public void setDeposit_balance(double deposit_balance) {
		this.deposit_balance = deposit_balance;
	}
	public double getWithdraw_balance() {
		return withdraw_balance;
	}
	public void setWithdraw_balance(double withdraw_balance) {
		this.withdraw_balance = withdraw_balance;
	}
}
