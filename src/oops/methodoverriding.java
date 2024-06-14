package oops;

class A
{
	void m1()
	{
		int a=10;
		System.out.println(a);
	}
}

class B extends A
{
	void m1()
	{
		int a=20;
		System.out.println(a);
	}
}


public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj=new B();
		obj.m1();
	}

}
