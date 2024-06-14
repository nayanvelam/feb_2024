package basic;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		for(int i=0;i<4;i++)
		{
			s[i]=sc.next();
			
		}
		System.out.println("Entered name  : ");
		for(String a:s)//for (datatype  v:arrayname)
		{
			System.out.println(a);
		}
	}

}
