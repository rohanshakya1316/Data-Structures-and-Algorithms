import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int num = sc.nextInt();
        int count = 0;
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print(num + " is a prime number.");
        }else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

