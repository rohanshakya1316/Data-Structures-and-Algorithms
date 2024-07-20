import java.util.Scanner;

public class RainFall {
    private double[] monthlyRainfall;

    // Constructor
    public RainFall() {
        monthlyRainfall = new double[12];
    }

    // Method to set monthly rainfall
    public void setMonthlyRainfall(int month, double rainfall) {
        if (rainfall < 0) {
            throw new IllegalArgumentException("Rainfall cannot be negative");
        }
        monthlyRainfall[month] = rainfall;
    }

    // Method to get monthly rainfall
    public double getMonthlyRainfall(int month) {
        return monthlyRainfall[month];
    }

    // Method to calculate total rainfall for the year
    public double getTotalRainfall() {
        double total = 0;
        for (double rainfall : monthlyRainfall) {
            total += rainfall;
        }
        return total;
    }

    // Method to calculate average monthly rainfall
    public double getAverageMonthlyRainfall() {
        return getTotalRainfall() / 12;
    }

    // Method to find the month with the most rain
    public int getMonthWithMostRain() {
        int maxMonth = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] > monthlyRainfall[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    // Method to find the month with the least rain
    public int getMonthWithLeastRain() {
        int minMonth = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < monthlyRainfall[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RainFall rainFall = new RainFall();

        // Input rainfall for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the rainfall for month " + (i + 1) + ": ");
            double rainfall = sc.nextDouble();
            while (rainfall < 0) {
                System.out.print("Invalid input. Enter a non-negative value for month " + (i + 1) + ": ");
                rainfall = sc.nextDouble();
            }
            rainFall.setMonthlyRainfall(i, rainfall);
        }

        // Display total, average, and extreme rainfall months
        System.out.println("Total rainfall for the year: " + rainFall.getTotalRainfall());
        System.out.println("Average monthly rainfall: " + rainFall.getAverageMonthlyRainfall());
        System.out.println("Month with the most rain: " + (rainFall.getMonthWithMostRain() + 1));
        System.out.println("Month with the least rain: " + (rainFall.getMonthWithLeastRain() + 1));

        sc.close();
    }
}
