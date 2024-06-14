package oops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int firstnumber = number;
        int numDigits = 0;
        int sum = 0;
        int temp = firstnumber;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }
        temp = firstnumber;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        if (sum == firstnumber) {
            System.out.println(firstnumber + " is an Armstrong number.");
        } else {
            System.out.println(firstnumber + " is not an Armstrong number.");
        }
    }
}