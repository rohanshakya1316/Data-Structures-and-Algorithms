import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to reverse: ");
        String word = sc.nextLine();
        System.out.print("Before Reverse: " + word);
        System.out.println();

        char temp;
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
            reverse = temp + reverse;
        }

        System.out.print("After Reverse: " + reverse);
    }
}
