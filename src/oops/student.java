package oops;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class student
{
	public void mark()
	{
		System.out.println("mark");
	}
}






//Interface for Principal
interface Principal {
 void resign();
 void rejoin();
}

//Student class
class Student {
 String name;
 int rollNumber;
 int marks;

 // Constructor
 public Student(String name, int rollNumber) {
     this.name = name;
     this.rollNumber = rollNumber;
 }

 // Method to set marks
 public void mark(int marks) {
     this.marks = marks;
 }

 // Method to display student details
 public void showDetails() {
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Marks: " + marks);
 }
}

//Teacher class extending Student and implementing Principal interface
class Teacher extends Student implements Principal {
 String department;

 // Constructor
 public Teacher(String name, int rollNumber, String department) {
     super(name, rollNumber);
     this.department = department;
 }

 // Method from Principal interface
 @Override
 public void resign() {
     System.out.println("Teacher " + name + " has resigned.");
 }

 // Method from Principal interface
 @Override
 public void rejoin() {
     System.out.println("Teacher " + name + " has rejoined.");
 }

 // Method to display teacher details including department
 public void showDetails() {
     super.showDetails();
     System.out.println("Department: " + department);
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Creating a student object
     Student student = new Student("Alice", 101);
     student.mark(90);
     System.out.println("Student Details:");
     student.showDetails();

     // Creating a teacher object
     Teacher teacher = new Teacher("Bob", 201, "Mathematics");
     teacher.mark(95);
     System.out.println("\nTeacher Details:");
     teacher.showDetails();

     // Resigning and rejoining the teacher
     teacher.resign();
     teacher.rejoin();
 }
}
