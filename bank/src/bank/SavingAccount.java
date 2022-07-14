package bank;

public class SavingAccount extends Account {

	@Override
	public void printStatement() {
		System.out.println("---- Saving Account Statement ----");
		super.printCommonInformation();
	}
	
}
