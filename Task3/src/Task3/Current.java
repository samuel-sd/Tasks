package Task3;

import java.util.Scanner;

public class Current {
	static Integer i=1;
	static Current obj=new Current();
	private Current(){
		
	}
	 public static Current  getobject() {
			return obj;
		}
	
	static Scanner input = new Scanner(System.in);
	  
	  int amt;
	public  static int bal;  
	
	 public int deposit() {
	    System.out.print("Enter amount to deposit:");
	    amt = input.nextInt();
	    if (amt < 0) {
	      System.out.println("Invalid Amount");
	      return 1;
	    }
	    Current.bal =Current.bal  + amt;
	    return 0;
	  }

	 public int withdraw() {
	    System.out.println("Your Balance=" + Current.bal);
	    System.out.print("Enter amount to withdraw:");
	    amt = input.nextInt();
	    if (Current.bal < amt) {
	      System.out.println("Not sufficient balance.");
	      return 1;
	    }
	    if (amt < 0) {
	      System.out.println("Invalid Amount");
	      return 1;
	    }
	   Current. bal = Current.bal - amt;
	    return 0;
	  }

	 public void display() {
	    System.out.println("Name:" + BankAccount.name);
		  System.out.println("Account No:" + BankAccount.CurrentaccNo);
	  System.out.println("Current Balance:" + Current.bal);

	  }

	public  void dbal() {
	    System.out.println("Balance:" + Current.bal);
	  }

	  public static void main(String[] args) {
			boolean flag = false;
			

	  
	   Current s1= Current.getobject();
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
	  		
	  		 BankUser.currentAcc.put(i, BankAccount.CurrentaccNo);
	  		BankUser.currentName.put(i,BankAccount.name);	
			BankUser.currentBal.put(i, BalNew);
			 Current.i=Current.i+1;
	        quit = true;
	        break;
	      }
	      
	    } while (!quit);
			
		
	  }
}
