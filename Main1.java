public class Main1 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 0, 1); // Large pizza, 1 cheese, 1 ham
        Pizza pizza2 = new Pizza("medium", 2, 2, 0); // Medium pizza, 2 cheese, 2 pepperoni


        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); // Set second pizza


        double total1 = order1.calcTotal();//Should be 22 (large) + 20 (medium) = 42
        System.out.println("Order 1 tatal: $"+total1);

        PizzaOrder order2 = new PizzaOrder(order1); // Use copy constructor
        order2.getPizza1().setNumCheeseToppings(3); // Change toppings

        double total2 = order2.calcTotal(); // Should be 26 (large with 3 cheese) + 20 (medium) = 46
        double origTotal1 = order1.calcTotal(); // Should still be 42

        System.out.println("Order 2 Total: $" + total2);
        System.out.println("Order 1 Original Total: $" + origTotal1);
    }
}

