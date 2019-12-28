package Task3;

import java.util.Scanner;

public class BankAccount {
	static  Scanner input = new Scanner(System.in);
	    public static String name;
	    public static int accNo=100;
	    public static int CurrentaccNo=200;
	    

  static BankAccount obj=new BankAccount(name,accNo);
	  private BankAccount(String name,int accNo)
	  {
		  BankAccount.name=name;
		  BankAccount.accNo=accNo;
	  }
	  public static BankAccount  getobject_singleton() {
			return obj;
		}

   
    void display() {
      System.out.println("Name:" + name);
      System.out.println("Account No:" + accNo);
     

    }
   
    public static void main(String args[]) {
    	   boolean quit = false;
      System.out.println("Enter your Name: ");
      name = input.next();
//      System.out.println("Enter Account Number: ");
//      accNo = input.nextInt();
      
      do {
      System.out.println("Select Account Type: \n 1.Savings\n 2.Current\n 3.Loan\n4.Exit");
      int type = input.nextInt();
    switch(type)
    {
    case 1:
    {
    	Task3.Savings.main(args);
    	break;
    }
    case 2:
    {
    	Task3.Current.main(args);
    	break;
    }
    case 3:
    {
    	Task3.LoanPay.main(args);
    	break;
    }
  
    case 4:
    {
    	BankUser.count++;
    	quit = true;
        break;
    }
      }
    } while (!quit);
    

    }
  }
