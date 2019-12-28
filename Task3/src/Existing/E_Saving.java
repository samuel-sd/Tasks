package Existing;

import java.util.Scanner;

import Task3.BankUser;
import Task3.Savings;

public class E_Saving {
	static Scanner input = new Scanner(System.in);

	int amt;
	static int bal;
static	int balance;

	

	int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();//100
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
	System.out.println(ExistingMain.imp);
	balance =BankUser.SavBal.get(ExistingMain.imp)+ amt;          //100+100
	BankUser.SavBal.put(ExistingMain.imp, balance);
		return 0;
	}

	int withdraw() {
		System.out.println("Your Balance=" + BankUser.SavBal.get(ExistingMain.imp));
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
		if (bal < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		balance = BankUser.SavBal.get(ExistingMain.imp) - amt;
		BankUser.SavBal.put(ExistingMain.imp, balance);
		return 0;
	}

	void display() {
		System.out.println("Name:" + BankUser.SavName.get(ExistingMain.imp));
	      System.out.println("Account No:" + BankUser.Sav.get(ExistingMain.imp));
		System.out.println("Balance:" + BankUser.SavBal.get(ExistingMain.imp));		
	}

	void dbal() {
		System.out.println("Balance:" +  BankUser.SavBal.get(ExistingMain.imp));
	}


	public static void main(String[] args) {
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
				quit = true;
				break;
			}
		} while (!quit);

	}
}
