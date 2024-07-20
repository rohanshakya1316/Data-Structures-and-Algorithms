import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient a, b, c: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant))/ (2 * a);
            double root2 = (-b - Math.sqrt(discriminant))/ (2 * a);
            System.out.println("The two real roots of the equation are");
            System.out.println(root1 + " " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The two real roots are equal and the root is");
            System.out.println(root);
        } else {
            System.out.println("The equation has imaginary roots.");
        }
    }
}
