import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String word = sc.nextLine();

        char temp;
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
            reverse = temp + reverse;
        }
        if (word.compareTo(reverse) == 0) {  // if(word.equals(reverse))
            System.out.print("String " + word + " is palindrome.");
        } else {
            System.out.println("String " + word + " is not palindrome.");
        }
    }
}
