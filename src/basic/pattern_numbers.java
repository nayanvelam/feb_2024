package basic;

public class pattern_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
	}

}
