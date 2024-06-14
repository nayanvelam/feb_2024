package basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;        
        series(n);
    }
    
    public static void series(int n) {
        int f = 0, second= 1;
        
        System.out.print(f + " " + second);
        for (int i = 3; i <= n; i++) {
            int third= f + second;
            System.out.print(" " + third);
            f= second;
            second = third;
        }
    }
}
