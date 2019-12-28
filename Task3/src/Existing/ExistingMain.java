package Existing;

import java.util.Scanner;

import Task3.BankUser;
public class ExistingMain {
	  public  static int imp;
  
public static void main(String[] args) {
	
	 boolean quit = false;
	 Scanner input = new Scanner(System.in);
     System.out.println("Enter your Name: ");
     String name = input.next();
     String a=name;
//System.out.println(BankUser.SavName);
     for(int i=1;i<BankUser.count;i++)
     {

    	 if(BankUser.SavName.get(i).contains(name))
    	 {
    		 ExistingMain.imp=i;
    		 System.out.println( ExistingMain.imp);
    		 System.out.println(i);
        	 System.out.println(BankUser.SavName.get(i)); 
    		 break;
    	 }
//    	
//    	 else 
//    		 System.out.println("");
     }

     
//     System.out.println("Enter Account Number: ");
//     accNo = input.nextInt();
     
     do {
     System.out.println("Select Account Type: \n 1.Savings\n 2.Current\n 3.Loan\n4.Exit");
     int type = input.nextInt();
   switch(type)
   {
   case 1:
   {
	   Existing.E_Saving.main(args);
   	break;
   }
   case 2:
   {
   	Existing.E_Current.main(args);
   	break;
   }
   case 3:
   {
   	Task3.LoanPay.main(args);
   	break;
   }
   case 4:
   {
   	quit = true;
       break;
   }
     }
   } while (!quit);
   

   }
}


