package basic;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; 
       int factorial = fact(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
        	factorial = factorial * i;
        }
        return factorial;
    }
}
