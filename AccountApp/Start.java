import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		
		a1.setAccountNumber(11111111);
		a1.setAccountHolderName("OOP1 A");
		a1.setBalance(25000.0);
		
		System.out.println("Account Number: " + a1.getAccountNumber());
		System.out.println("Account Holder Name: " + a1.getAccountHolderName());
		System.out.println("Account Balance: " + a1.getBalance());
		
		System.out.println("------------------------------");
		
		Account a2 = new Account(22222222, "OOP1 B", 20000.0);
		a2.showDetails();
	}
}