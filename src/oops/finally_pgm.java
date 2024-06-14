package oops;

public class finally_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Started");
		try
		{
			int i=10;
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

		finally
		{
			System.out.println("This is finally");
		}
		System.out.println("Stopped");
	}

}
