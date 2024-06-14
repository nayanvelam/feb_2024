package basic;

import java.util.Scanner;

public class calculator_scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter operation (1-addition, 2-subtraction,3-multiplication): ");
        //String operation = scanner.next();
        int c=scanner.nextInt();

        int result = 0;

        switch (c) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
