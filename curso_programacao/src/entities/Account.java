package entities;

import services.Show;

public class Account {
	private static final double TAX = 5.0;
	private int id;
	private String holder;
	private double balance;
	private int numbersDeposit;

	public Account(int id, String holder) {
		this.id = id;
		this.holder = holder;
	}

	public int getId() {
		return id;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumbersDeposit() {
		return numbersDeposit;
	}

	public void deposit(double deposit, Account acc) {
		balance += deposit;
		Show.showAccountData(acc);
		numbersDeposit++;
	}

	public void withdraw(double withdraw, Account acc) {
		if (validationWithdraw(acc, withdraw)) {
			balance -= TAX;
			balance -= withdraw;
			Show.showAccountData(acc);
		}
	}

	public boolean validationWithdraw(Account acc, double withdraw) {
		if (acc.getBalance() < withdraw + TAX) {
			System.out.printf(
					"Your balance is insufficient... There are $ %.2f in your account.%nThe bank requires a fee of $ %.2f",
					acc.getBalance(), TAX);
			return false;
		}
		return true;
	}

	public String toString() {
		return "Account data: Account" + id + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	} 
	
	public String toStringUpdated() {
		return "Updated account data: Account" + id + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	} 
}
