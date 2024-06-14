package oops;

public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c=new Cat();
		Dog d=new Dog();
		c.eating();
		d.eating();
	}

}

class Animal {
	public void eating() {
		System.out.println("Animals can eat...");
	}
}

class Cat extends Animal {
	
	public void sleep() {
		System.out.println("Cat is sleeping...");
	}
}

class Dog extends Animal {
	
	public void bark() {
		System.out.println("Dog is barking...");
	}
}
