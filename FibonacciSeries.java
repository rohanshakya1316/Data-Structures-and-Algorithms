import java.util.Scanner;

public class FibonacciSeries {
     static int fiboRecursive(int n) {
        if (n <= 1){
            return n;
        }else {
            return fiboRecursive(n - 1) + fiboRecursive(n - 2);
        }
    }

    static int fiboIterative(int n) {
         int first = 0, second = 1, next;
         for (int i = 0; i < n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
         return first;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term: ");
        int n = sc.nextInt();
        System.out.println("Recursive Fibonacci value for " + n + "th term is: " + fiboRecursive(n-1));
        System.out.println("Iterative Fibonacci value for " + n + "th term is: " + fiboIterative(n-1));

    }
}
