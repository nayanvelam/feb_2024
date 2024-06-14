package basic;
import java.util.Scanner;

public class twoD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		int a[][]=new int[2][3];
		System.out.println("Enter elements of the array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
		System.out.println("Entered values are : ");
		for(int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
