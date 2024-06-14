package basic;

import java.util.Scanner;

public class one_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers");
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Entered numbers Are : ");
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);1
		}
	}

}
