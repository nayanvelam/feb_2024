package oops;

import java.util.Scanner;

public class metrix_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][]b = new int[3][3];
        int[][] result = new int[3][3];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }  
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
//addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	result[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}