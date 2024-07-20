public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Exception alert: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
