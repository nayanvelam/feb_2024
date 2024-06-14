package oops;

import java.util.Scanner;

public class array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);
	        int[] array = new int[5];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < 5; i++) {
	            array[i] = scanner.nextInt();
	        }
	        System.out.println("Original array is :");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(array[i] + " ");
	        }
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5 - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println();
	        System.out.println("Array in Ascending order:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(array[i] + " ");
	        }
	}

}
