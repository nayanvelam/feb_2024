package oops;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("String is : " + str);
        System.out.println("Reversed string is : " + reversed);
    }
}