public class Pizza {
    private String size;
    private int numCheeseToppings;
    private int numPepperoniToppings;
    private int numHamToppings;

    public Pizza(String size, int numCheeseToppings, int numPepperoniToppings, int numHamToppings){
        this.size = size;
        this.numCheeseToppings = numCheeseToppings;
        this.numPepperoniToppings = numPepperoniToppings;
        this.numHamToppings = numHamToppings;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setNumCheeseToppings(int numCheeseToppings) {
        this.numCheeseToppings = numCheeseToppings;
    }

    public int getNumCheeseToppings() {
        return numCheeseToppings;
    }

    public void setNumPepperoniToppings(int numPepperoniToppings) {
        this.numPepperoniToppings = numPepperoniToppings;
    }

    public int getNumPepperoniToppings() {
        return numPepperoniToppings;
    }

    public void setNumHumToppings(int numHumToppings) {
        this.numHamToppings = numHamToppings;
    }

    public int getNumHamToppings() {
        return numHamToppings;
    }

    public double calcCost(){
        int basePrice;
        switch (size.toLowerCase()){
            case "small":
                basePrice = 10;
                break;
            case "medium":
                basePrice = 12;
                break;
            case "large":
                basePrice = 14;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza size.");
        }
        int totalToppings = numCheeseToppings + numPepperoniToppings + numHamToppings;
        return basePrice + 2 * totalToppings;
    }

    public String getDescription(){
        return "Size" + size +
                ", Cheese Toppings" + numCheeseToppings +
                ", Pepperoni Toppings" + numPepperoniToppings +
                ", Ham Toppings" + numHamToppings +
                ", Cost: $" +calcCost();
    }
}

