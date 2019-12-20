package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Update extends SecondTa {
	private static ArrayList<SecondTa> al4 = new ArrayList<>();

	public static void update() {
		Scanner sc = new Scanner(System.in);

		int count = 4;
		System.out.println("Select the Roll Number of Student");
		int value = sc.nextInt();
		String[] cutting;
		System.out.println("1.Name\n2.Age\n3.Grade");
		int method = sc.nextInt();
		// ArrayList<SecondTa> al2=new ArrayList<>();
		String arr[] = new String[10];
		int h = 0;
		try {

			File fin = new File("D:\\sample.txt");
			BufferedReader br = new BufferedReader(new FileReader(fin));
			String st;
			String comma = ",";

			System.out.println("The datas on file:");
			while ((st = br.readLine()) != null) {

				arr[h] = st;
				h++;
				count++;

			}
			ArrayList<SecondTa> al = new ArrayList<>();
			ArrayList<SecondTa> al2 = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				cutting = arr[i].split(comma);

				SecondTa obj2 = new SecondTa();
				if (i == (value - 1)) {
					abc: while (true) {
						switch (method) {
						case 1: {
							System.out.println("Enter the new name: ");
							cutting[0] = sc.next();
							obj2.setName(cutting[0]);
							obj2.setAge(Integer.parseInt(cutting[1]));
							obj2.setGrade(cutting[2].charAt(0));
							obj2.setRoll_no(Integer.parseInt(cutting[3]));
							al4.add(obj2);
							// al2.add(obj2);
							break abc;
						}
						case 2: {
							System.out.println("Enter the latest Age: ");
							cutting[1] = sc.next();
							obj2.setName(cutting[0]);
							obj2.setAge(Integer.parseInt(cutting[1]));
							obj2.setGrade(cutting[2].charAt(0));
							obj2.setRoll_no(Integer.parseInt(cutting[3]));
							al4.add(obj2);
							// al2.add(obj2);
							break abc;
						}
						case 3: {
							System.out.println("Enter the Updated Grade: ");
							cutting[2] = sc.next();
							obj2.setName(cutting[0]);
							obj2.setAge(Integer.parseInt(cutting[1]));
							obj2.setGrade(cutting[2].charAt(0));
							obj2.setRoll_no(Integer.parseInt(cutting[3]));
							al4.add(obj2);
							// al2.add(obj2);
							break abc;
						}
						}
					}
				}
				obj2.setName(cutting[0]);
				obj2.setAge(Integer.parseInt(cutting[1]));
				obj2.setGrade(cutting[2].charAt(0));
				obj2.setRoll_no(Integer.parseInt(cutting[3]));
				al.add(obj2);
				al2.add(obj2);
				al4.add(obj2);
			} 	
		} catch (Exception e) {
			// System.out.println(e);
		}
	}

	public static ArrayList<SecondTa> getAl4() {
		return al4;
	}

	public static void setAl4(ArrayList<SecondTa> al4) {
		Update.al4 = al4;
	}
}