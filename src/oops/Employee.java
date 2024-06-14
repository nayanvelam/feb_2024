package oops;

public class Employee {
    int emp_id;
    String emp_name;
    String department;
    int salary;
    
    public void display() {
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(department);
        System.out.println(salary);
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.emp_id=1;
        emp.emp_name="sample";
        emp.department="abc";
        emp.salary=20000;
        emp.display();
    }
}

