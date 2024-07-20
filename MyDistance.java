class Distance {
    private final int feet;
    private final int inches;

    Distance (int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance addDistance(Distance next) {
        int feetSum = this.feet + next.feet;
        int inchesSum = this.inches + next.inches;
        if(inchesSum >= 12) {
            feetSum += inchesSum / 12;
            inchesSum %= 12;
        }
        return new Distance(feetSum, inchesSum);
    }

    public Distance subtractDistance(Distance next) {
        int feetDiff = this.feet - next.feet;
        int inchesDiff = this.inches - next.inches;
        if(inchesDiff < 0) {
            feetDiff--;
            inchesDiff += 12;
        }
        return new Distance(feetDiff, inchesDiff);
    }

    public void displayDistance() {
        System.out.println("Total Feet: " + feet + " and total inches: " + inches);
    }
}

public class MyDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(10,11);
        Distance d2 = new Distance(5, 10);

        Distance add = d1.addDistance(d2);
        System.out.println("Sum of the distances is ");
        add.displayDistance();

        Distance sub = d1.subtractDistance(d2);
        System.out.println("Difference of the distances is ");
        sub.displayDistance();
    }
}
