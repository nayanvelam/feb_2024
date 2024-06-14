package oops;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    classroom student1 = new classroom();
	        student1.store(101, 90);
	        System.out.println("Student Details:");
	        student1.display();
	}

}

class classroom
{
	int rollno;
	int mark;
	public void store(int RollNumber, int Mark) {
        rollno =RollNumber;
        mark = Mark;
    }
	public void display() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Mark: " + mark);
    }

}