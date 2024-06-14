package oops;

public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.eating();
		c.sleeping();

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
 