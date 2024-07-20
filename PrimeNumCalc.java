import java.util.Scanner;

public class PrimeNumCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range for prime number: ");
        int n = sc.nextInt();
        System.out.println("The prime numbers upto " + n + " are");
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + "  ");
            }
        }
    }
}
