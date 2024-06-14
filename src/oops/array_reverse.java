package oops;

import java.util.Scanner;

public class array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[] array = new int[5];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < 5; i++) {
	            array[i] = scanner.nextInt();
	        }
	        System.out.println("Original array:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(array[i] + " ");
	        }
	        int start = 0;
	        int end = 4;// 5-1
	        while (start < end) {
	            
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        }
	        System.out.println();
	        System.out.println("Reversed array:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
	}