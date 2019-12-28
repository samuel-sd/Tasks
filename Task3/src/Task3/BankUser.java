package Task3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class BankUser {
	 static  public LinkedHashMap<Integer, Integer> currentAcc=new LinkedHashMap<Integer, Integer>();
		static public  LinkedHashMap<Integer, String> currentName=new LinkedHashMap<Integer, String>();
		static public LinkedHashMap<Integer, Integer> currentBal=new LinkedHashMap<Integer, Integer>();
		static  public LinkedHashMap<Integer, Integer> Sav=new LinkedHashMap<Integer, Integer>();
		static public  LinkedHashMap<Integer, String> SavName=new LinkedHashMap<Integer, String>();
		static public LinkedHashMap<Integer, Integer> SavBal=new LinkedHashMap<Integer, Integer>();
		public static int count=0;
	public static void main(String[] args) {
	    boolean quit = false;
	    do {
	  Scanner input= new Scanner(System.in);
	      System.out.println("Select Account Type: \n 1.New User\n 2.Existing\n 3.Exit\n");
	        int type = input.nextInt();
	      switch(type)
	      {
	      case 1:
	      {
	    	   Current.bal =0;
	    	   Savings.bal=0;
	    	    BankAccount.CurrentaccNo++;
		        BankAccount.accNo++;
	        Task3.BankAccount.main(args);
	        break;
	      }
	      case 2:
	      {
	        Existing.ExistingMain.main(args);
	        break;
	      }
	      case 3:
	      {
	       quit=true;
	        break;
	      }

	  }}
	      while (!quit);
	    
	}
	
}
