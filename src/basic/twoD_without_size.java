package basic;
import java.util.Scanner;

public class twoD_without_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		int a[][]={{22,11},{33,88},{11,22}};
	
		System.out.println("Entered values are : ");
		for(int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
