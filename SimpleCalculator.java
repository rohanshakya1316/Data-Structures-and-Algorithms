import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Calculator is on.");

        while (continueCalculation) {
            double result = 0.0;
            System.out.println(" result = " + result);

            while (true) {
                System.out.print("Enter operation and number (e.g., +1, *2): ");
                String input = sc.nextLine().trim();

                if (input.equalsIgnoreCase("result")) {
                    System.out.println("Final result = " + result);
                    break;
                }

                try {
                    char operator = input.charAt(0);
                    double number = Double.parseDouble(input.substring(1).trim());

                    result = performOperation(result, operator, number);
                    System.out.println("Updated result = " + result);
                } catch (UnknownOperatorException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Reenter, your last line:");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format.");
                    System.out.println("Reenter, your last line:");
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred.");
                    System.out.println("Reenter, your last line:");
                }
            }

            System.out.print("Again? (y/n): ");
            String again = sc.nextLine().trim();
            if (!again.equalsIgnoreCase("y")) {
                continueCalculation = false;
            }
        }

        System.out.println("End of Program");
        sc.close();
    }

    public static double performOperation(double result, char operator, double number) throws UnknownOperatorException {
        switch (operator) {
            case '+':
                System.out.println(" result + " + number + " = " + (result + number));
                return result + number;
            case '-':
                System.out.println(" result - " + number + " = " + (result - number));
                return result - number;
            case '*':
                System.out.println(" result * " + number + " = " + (result * number));
                return result * number;
            case '/':
                System.out.println(" result / " + number + " = " + (result / number));
                return result / number;
            default:
                throw new UnknownOperatorException(operator + " is an unknown operation.");
        }
    }
}
