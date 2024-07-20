class Fruit {
    String name = "Banana";
    String taste = "tangy";
    String size = "fixed";
    void eat() {
        System.out.println(name + " is " + taste + ". Its size is " + size);
    }
}

class Apple extends Fruit {
    @Override
    void eat() {
        System.out.println("Apple is sweet. Its size is medium");
    }
}

class Orange extends Fruit {
    @Override
    void eat() {
        System.out.println("Orange is sour. Its size is small");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Fruit myFruit = new Fruit();
        myFruit.eat();
        Fruit myApple = new Apple();
        myApple.eat();
        Orange myOrange = new Orange();
        myOrange.eat();
    }

}
