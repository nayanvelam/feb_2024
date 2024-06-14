package oops;

public class methodoverriding_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c=new child();
		c.phone();
	}

}

class parent
{
	public void phone()
	{
		System.out.println("nokia");
		
	}
}
class child extends parent
{
	public void phone()
	
	{
		super.phone();
		System.out.println("iphone");
	}
}