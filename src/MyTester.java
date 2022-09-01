
public class MyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM citi = new ATM();
		citi.openAccount(1, 100);
		citi.openAccount(2);
		citi.openAccount(3,300);
		citi.openAccount (4);
		System.out.println(citi.checkBalance(1)); // Should be 100.0
		System.out.println(citi.checkBalance(2)); //Should be 0.0
		System.out.println(citi.checkBalance(3)); // Should be 300.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
		citi.closeAccount(3);
		citi.closeAccount(4);
		System.out.println(citi.checkBalance(1)); // Should be 100.0
		System.out.println(citi.checkBalance(2)); //Should be 0.0
		System.out.println(citi.checkBalance(3)); // Should be 0.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
		System.out.println (citi.depositMoney(1, 1));
		System.out.println (citi.depositMoney(2, 2));
		System.out.println (citi.depositMoney(3, 3));
		System.out.println (citi.depositMoney(4, 4));
		System.out.println(citi.checkBalance(1)); // Should be 101.0
		System.out.println(citi.checkBalance(2)); //Should be 2.0
		System.out.println(citi.checkBalance(3)); // Should be 303.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
		System.out.println (citi.withdrawMoney(1, .1));
		System.out.println (citi.withdrawMoney(2, .2));
		System.out.println (citi.withdrawMoney(3, 303.00));
		System.out.println (citi.withdrawMoney(4, 4));
		System.out.println(citi.checkBalance(1)); // Should be 100.9
		System.out.println(citi.checkBalance(2)); //Should be 1.8
		System.out.println(citi.checkBalance(3)); // Should be 0.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
		citi.closeAccount(3);
		citi.closeAccount(4);
		System.out.println (citi.depositMoney(1, -1));
		System.out.println (citi.depositMoney(2, -2));
		System.out.println (citi.depositMoney(3, 3));
		System.out.println (citi.depositMoney(4, 4));
		System.out.println(citi.checkBalance(1)); // Should be 100.9
		System.out.println(citi.checkBalance(2)); //Should be 1.8
		System.out.println(citi.checkBalance(3)); // Should be 0.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
		System.out.println (citi.withdrawMoney(1, -1));
		System.out.println (citi.withdrawMoney(2, -2));
		System.out.println (citi.withdrawMoney(3, 303.00));
		System.out.println (citi.withdrawMoney(4, 4));
		System.out.println(citi.checkBalance(1)); // Should be 100.9
		System.out.println(citi.checkBalance(2)); //Should be 1.8
		System.out.println(citi.checkBalance(3)); // Should be 0.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
		System.out.println (citi.withdrawMoney(1, 101.11));
		System.out.println (citi.withdrawMoney(2, 2.22));
		System.out.println (citi.withdrawMoney(3, 303.00));
		System.out.println (citi.withdrawMoney(4, 4));
		System.out.println(citi.checkBalance(1)); // Should be 100.9
		System.out.println(citi.checkBalance(2)); //Should be 1.8
		System.out.println(citi.checkBalance(3)); // Should be 0.0
		System.out.println(citi.checkBalance(4)); //Should be 0.0
	}


}
