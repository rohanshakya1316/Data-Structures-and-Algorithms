class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class ThreadOddEven {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        evenThread.start();
        oddThread.start();
    }
}

