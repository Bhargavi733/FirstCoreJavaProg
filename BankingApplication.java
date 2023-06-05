package Bank_App;
import java.util.Scanner;
public class BankingApplication 
{
	static Scanner sc=new Scanner(System.in);
	int balance=50000;
	int deposit,withdraw;
	
	void checkBalance()
	{
		System.out.println("Account Balance is: "+balance);
	}
	
	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawn: ");
		try {
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println(withdraw+" Rs is withdrawn. \n Account Balance is : "+balance);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid entry. Please enter a numeric value ");
		}
	}
	
	void deposit()
	{
		System.out.println("Enter the amount to be deposited: ");
		try {
			deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println(deposit+" Rs is deposited. \n Account Balance is : "+balance);
			}
		catch(Exception e)
		{
			System.out.println("Invalid entry. Please enter a numeric value ");
		}
	}

	void exit()
	{
		System.exit(0);
	}
	
	public static void main(String[] args)
	{
		BankingApplication ba=new BankingApplication();
		char cond;
		while(true)
		{
			do
			{
			System.out.println("Banking Application");
			System.out.println("Choose 1 to Check Balance");
			System.out.println("Choose 2 for Withdraw");
			System.out.println("Choose 3 for Deposit");
			System.out.println("Choose 4 for EXIT");
			System.out.println("Choose the operation you want to perform : ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					ba.checkBalance();
					break;
				case 2:
					ba.withdraw();
					break;
				case 3:
					ba.deposit();
					break;
				case 4:
					ba.exit();
					break;
				default:
					System.out.println("Its Invalid Choice");
					break;
			}
			System.out.println("Do you want to continue. Enter"+" Y "+" for yes and "+" N "+"for no :");
			cond=sc.next().charAt(0);
			}while(cond=='y' || cond=='Y');
		}
	}
}
