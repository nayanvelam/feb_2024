package oops;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean prime = true;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}