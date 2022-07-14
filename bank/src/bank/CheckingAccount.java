package bank;

public class CheckingAccount extends Account {

	@Override
	public void printStatement() {
		System.out.println("---- Checking Account Statement ----");
		super.printCommonInformation();
	}
	
}
