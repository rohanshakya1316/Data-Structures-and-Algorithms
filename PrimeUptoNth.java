import java.util.Scanner;

public class PrimeUptoNth {
    void displayPrime(int n) {
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
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        num = sc.nextInt();
        PrimeUptoNth myObj = new PrimeUptoNth();
        myObj.displayPrime(num);
    }
}
