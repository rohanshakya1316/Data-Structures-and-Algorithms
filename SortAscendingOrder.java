import java.util.Scanner;

public class SortAscendingOrder {
    // Insertion Sort
    static void sortAscending(int [] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void displayArray(int [] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        displayArray(arr);
        System.out.println();
        System.out.println("After Sorting: ");
        sortAscending(arr);
        displayArray(arr);
    }
}
