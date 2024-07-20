import java.util.Scanner;

public class DisplayCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the college name: ");
            String clzName = sc.nextLine();

            if (clzName.length() > 50) {
                throw new Exception("The length should not exceed 50 characters.");
            }

            System.out.println("College name: " + clzName);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



