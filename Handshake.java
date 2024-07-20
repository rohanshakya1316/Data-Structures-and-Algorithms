public class Handshake {
    // Recursive function to calculate the number of handshakes
    public static int handshake(int n) {
        if (n <= 1) {
            return 0; // Base case: no handshakes if there's 1 or 0 people
        } else {
            return handshake(n - 1) + (n - 1); // Recursive case
        }
    }
    public static void main(String[] args) {
        System.out.println("handshake(1) = " + handshake(1)); 
        System.out.println("handshake(2) = " + handshake(2)); 
        System.out.println("handshake(3) = " + handshake(3)); 
        System.out.println("handshake(4) = " + handshake(4)); 
        System.out.println("handshake(5) = " + handshake(5)); 
    }
}
