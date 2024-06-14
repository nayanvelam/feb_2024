package oops;

import java.util.Scanner;

public class largetnumber_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[5];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        

        int largest = array[0];

        for (int i = 1; i < 5; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest number  is: " + largest);
	}

}
