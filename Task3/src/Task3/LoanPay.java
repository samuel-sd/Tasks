package Task3;

import java.util.Scanner;

public class LoanPay {
	static LoanPay  obj=new LoanPay ();
	private LoanPay (){
		
	}
	 public static LoanPay  getobject() {
			return obj;
		}
	

	  public static void main(String []args)
	    {
	         
	        //Scanner class to take user input.
	        Scanner sc = new Scanner(System.in);
	         
	        double principal, rate, time, emi;
	  
	        System.out.print("Enter principal: ");
	        principal = sc.nextFloat();
	      
	        System.out.print("Enter rate: ");
	        rate = sc.nextFloat();
	      
	        System.out.print("Enter time in year: ");
	        time = sc.nextFloat();
	      
	        rate=rate/(12*100);     //one month interest
	        time=time*12;                //one month period
	        
//	       EMI FORMULA = [P * R * (1+R)^N]/[(1+R)^N-1]
      
	        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
	      
	        System.out.print("Monthly EMI is= "+emi+"\n");
               sc.close();
	    }
	}



 

   
