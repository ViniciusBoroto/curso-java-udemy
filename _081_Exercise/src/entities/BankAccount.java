package entities;

public class BankAccount {

	private int number;
	private String holder;
	private double balance;

	public BankAccount() {}
	
	public BankAccount(int number, String name, double deposit) {
		this.number = number;
		this.holder = name;
		deposit(deposit);
	}
	
	public BankAccount(int number, String name) {
		this.number = number;
		this.holder = name;
		this.balance = 0;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.number, this.holder, this.balance);
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5;
	}
}
