public class SimpleInterest {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please input principle, rate and time properly in run time.");
            return;
        }
        double principle = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double interest = (principle * rate * time) / 100;
        System.out.println("The simple interest is " + interest);
    }
}
