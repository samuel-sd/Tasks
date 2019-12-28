package Existing;

import java.util.Scanner;

import Task3.BankUser;
import Task3.Current;

public class E_Current {
	static Scanner input = new Scanner(System.in);

	int amt;
	static int bal;


	

	int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
	bal = BankUser.currentBal.get(ExistingMain.imp) + amt;
	BankUser.currentBal.put(ExistingMain.imp, bal);
		return 0;
	}

	int withdraw() {
		System.out.println("Your Balance=" + BankUser.currentBal.get(ExistingMain.imp));
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
		if (BankUser.currentBal.get(ExistingMain.imp) < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		Current.bal =  BankUser.currentBal.get(ExistingMain.imp) - amt;
		BankUser.currentBal.put(ExistingMain.imp, Current.bal);
		return 0;
	}

	void display() {
		System.out.println("Name:" + BankUser.currentName.get(ExistingMain.imp));
	      System.out.println("Account No:" + BankUser.currentAcc.get(ExistingMain.imp));
		System.out.println("Balance:" + BankUser.currentBal.get(ExistingMain.imp));		
	}

	void dbal() {
		System.out.println("Balance:" + Current.bal);
	}


	public static void main(String[] args) {
		 Current s1 = Current.getobject();
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
