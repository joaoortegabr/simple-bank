package bank;

public abstract class Account implements IAccount {

	private final int DEFAULT_BRANCH = 1;
	private static int INCREMENTING_ACCOUNT = 1;

	protected int branch;
	protected int accountNumber;
	protected double balance;
	
	public Account() {
		this.branch = DEFAULT_BRANCH;
		this.accountNumber = INCREMENTING_ACCOUNT++;
	}

	
	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void transfer(double amount, Account targetAccount) {
		if (balance >= amount) {
			this.withdraw(amount);
			targetAccount.deposit(amount);
		} else {
			System.out.println("Insufficient balance.");
		}
	}
	
	
	public int getBranch() {
		return branch;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}


	protected void printCommonInformation() {
		System.out.println(String.format("Branch: %d", this.branch));
		System.out.println(String.format("Account Number: %d", this.accountNumber));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
	
	
}
