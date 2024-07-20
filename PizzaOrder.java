public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private int numPizzas;

    public PizzaOrder() {
    }

    public void setNumPizzas(int numPizzas){
        if (numPizzas < 1 || numPizzas > 3){
            throw new IllegalArgumentException("Number of pizza must be between 1 and 3");
        }
        this.numPizzas = numPizzas;
    }

    public void setPizza1(Pizza pizza1){
        this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2){
        this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3){
        this.pizza3 = pizza3;
    }

    public int getNumPizzas(){
        return numPizzas;
    }

    public Pizza getPizza1(){
        return pizza1;
    }

    public Pizza getPizza2(){
        return pizza2;
    }

    public Pizza getPizza3(){
        return pizza3;
    }

    public double calcTotal(){
        double total = 0;
        if (pizza1 != null) total += pizza1.calcCost();
        if (pizza2 != null) total += pizza2.calcCost();
        if (pizza3 != null) total += pizza3.calcCost();
        return total;
    }

    public PizzaOrder(PizzaOrder other){
        this.numPizzas = other.numPizzas;
        if (other.pizza1 != null) this.pizza1 = new Pizza(other.pizza1.getSize(), other.pizza1.getNumCheeseToppings(), other.pizza1.getNumPepperoniToppings(), other.pizza1.getNumHamToppings());
        if (other.pizza2 != null) this.pizza2 = new Pizza(other.pizza2.getSize(), other.pizza2.getNumCheeseToppings(), other.pizza2.getNumPepperoniToppings(), other.pizza2.getNumHamToppings());
        if (other.pizza3 != null) this.pizza3 = new Pizza(other.pizza3.getSize(), other.pizza3.getNumCheeseToppings(), other.pizza3.getNumPepperoniToppings(), other.pizza3.getNumHamToppings());
    }
}

