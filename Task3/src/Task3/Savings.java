package Task3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Savings {
	static Integer i=1;
	static Savings obj=new Savings();
	private Savings(){
		
	}
	 public static Savings  getobject() {
			return obj;
		}
	
	 
	static Scanner input = new Scanner(System.in);

	int amt;
public	static int bal;

//
//	public Savings(int bal) {
//
//		Savings.bal = bal;
//	}

	public int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		Savings.bal =Savings.bal + amt;
		return 0;
	}

	public int withdraw() {
		System.out.println("Your Balance=" + Savings.bal );
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
		if (Savings.bal  < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		Savings.bal  = Savings.bal - amt;
		return 0;
	}

	public void display() {
		System.out.println("Name:" + BankAccount.name);
	      System.out.println("Savings Account No:" + BankAccount.accNo);
		System.out.println("Savings Account Balance:" + Savings.bal );
		
	}

	public void dbal() {
		System.out.println("Balance:" + Savings.bal );
	}
//	void UserInfo()
//	{
//		System.out.println("Enter the account Number");
//	 int s=input.nextInt();
//	 System.out.println("The Account Details are");
//	 System.out.println("Name:" + Sav.get(s));
//	 System.out.println("Account No:" + Sav.get(Sav)); 
//	}

	public static void main(String[] args) {
		boolean flag = false;
		
		 Savings s1 = Savings.getobject();
		int menu;
		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Exit");
		boolean quit = false;
		
		do {
			System.out.print("Enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				s1.deposit();
				break;

			case 2:
				s1.withdraw();
				break;

			case 3:
				s1.display();
				break;

			case 4:
				
				Integer BalNew=bal;
			
				 BankUser.Sav.put(i, BankAccount.accNo);

				BankUser.SavName.put(i,BankAccount.name);	

				BankUser.SavBal.put(i, BalNew);

				 Savings.i=Savings.i+1;
				 System.out.println(i);
				quit = true;
				break;
			}
			flag=true;
			
		} while (!quit);
		
}
}
