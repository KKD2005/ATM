import java.util.*;
public class ATM {
	private HashMap <Long, Double> bankAccounts;
	public ATM(){
		bankAccounts=new HashMap <Long,Double>();
	}
	public void openAccount (long accountNumber) {
		bankAccounts.put (accountNumber, 0.0);
	}
	public void openAccount (long accountNumber, double initialDeposit) {
		bankAccounts.put (accountNumber, initialDeposit);
	}
	
}