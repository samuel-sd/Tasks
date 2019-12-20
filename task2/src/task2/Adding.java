package task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Adding extends SecondTa {

	private static 
	 ArrayList<SecondTa> al3=new ArrayList<>();


	public static void add()
	{
		try {
			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of the students: ");
	 String details=sc.next();
	 try (FileWriter f = new FileWriter("D:\\sample.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
		 //p.println();
         p.println(details);
     
     } catch (Exception e) {
      
     }
		//File file = new File("D:\\sample.txt");
		
		    //System.out.println(file.createNewFile());
		    
		
		String comma=",";
		int values=4;
		String[] cutting;
		
		SecondTa obj2=new SecondTa();
		for (int i = 0; i < values; i++) {
			cutting = details.split(comma);
			obj2.setName(cutting[0]);
			obj2.setAge(Integer.parseInt(cutting[1]));
			obj2.setGrade(cutting[2].charAt(0)); 
			obj2.setRoll_no(Integer.parseInt(cutting[3]));
			
		}
		al3.add(obj2);
		//System.out.println(al3);
		}
		catch(Exception e) {
			
		}
	}
	
	public static ArrayList<SecondTa> getAl3() {
		return al3;
	}
	public static void setAl3(ArrayList<SecondTa> al3) {
		Adding.al3 = al3;
	}
	

}
