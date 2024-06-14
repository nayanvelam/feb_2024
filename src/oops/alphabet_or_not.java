package oops;

import java.util.Scanner;

public class alphabet_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        char c = scanner.next().charAt(0);                
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z')) {
            System.out.println(c + " is an alphabet.");
        }
        else
        	
        {
            System.out.println(c + " is not an alphabet.");
        }
	}

}
