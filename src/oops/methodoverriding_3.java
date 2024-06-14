package oops;

public class methodoverriding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b=new BMW();
		b.speed();
		b.power();
	}

}
class car
{
	public void speed()
	{
		System.out.println("car speed");
	}
	public void power()
	{
		System.out.println("car power");
	}
}
class BMW extends car
{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		super.power();
	}
	
}