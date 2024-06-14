package oops;

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cat c=new Cat();
    Lion l=new Lion();
    c.eating();
    
    l.eating();
    l.sleeping();

	}

}
class Dog
{
	public void eating()
	{
		System.out.println("Dog is eating");
	}
				

}
class Cat extends Dog
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
		
	}
}
class Lion extends Cat
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}