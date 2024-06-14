package basic;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name=sc.next();
		System.out.println("Enter your Age : ");
		int age=sc.nextInt();
		System.out.println("Enter the Character : ");
		char c=sc.next().charAt(0);
	}

}
