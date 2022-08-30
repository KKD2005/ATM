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
	public void closeAccount (long accountNumber) {
		Double money = bankAccounts.get (accountNumber);
		if (money!=null) {
			bankAccounts.remove (accountNumber, 0);
		}
	}
	public double checkBalance(long accountNumber) {
		Double money = bankAccounts.get (accountNumber);
		if (money!=null) {
			return money;
		}
		return 0.0;
	}
	public boolean depositMoney(long accountNumber, double amountToDeposit) {
		if (bankAccounts.containsKey(accountNumber)==false) {
			return false;
		} else if (amountToDeposit <0){
			return false;
		}
			else {
			bankAccounts.replace (accountNumber, bankAccounts.get(accountNumber)+amountToDeposit);
			return true;
		}
	}
	public boolean withdrawMoney (long accountNumber, double amountToWithdraw) {
		if (bankAccounts.containsKey(accountNumber)==false) {
			return false;
		}else if (amountToWithdraw<0){
			return false;
		}else if (amountToWithdraw>bankAccounts.get(accountNumber)){
			return false;
		}else {
			bankAccounts.replace (accountNumber, bankAccounts.get(accountNumber)-amountToWithdraw);
			return true;
		}
	}
	
}