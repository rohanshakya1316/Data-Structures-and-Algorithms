// A Java program to find the greatest among three numbers.
import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers to find greatest: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Greatest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatest number is " + num2);
        } else {
            System.out.println("Greatest number is " + num3);
        }
        sc.close();
    }
}
