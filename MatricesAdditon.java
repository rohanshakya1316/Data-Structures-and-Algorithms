import java.util.Scanner;

public class MatricesAdditon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of matrix: ");
        int cols = sc.nextInt();
        int [][] mat1 = new int[rows][cols];
        int [][] mat2 = new int[rows][cols];
        int [][] sum = new int[rows][cols];

        System.out.println("For First Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element at arr[%d][%d]: ", i, j);
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("For Second Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element at arr[%d][%d]: ", i, j);
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The sum of two matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
