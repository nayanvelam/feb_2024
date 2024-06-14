package oops;


class Monkey {
	
    void jump() {
        System.out.println("Monkey jumps");
    }

    void bite() {
        System.out.println("Monkey bites");
    }
}
interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey 
implements BasicAnimal 
{
	public void speak()
	{
		System.out.println("human speaks");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
	}

   
}

public class inherits_implements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h=new Human();
		h.jump();
		h.bite();
		h.eat();
		h.sleep();
		h.speak();
		
	
	}

}
