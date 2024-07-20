class AddMethodOverload {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public Double add(double num1, double num2) {
         return num1 + num2;
    }

}

public class MethodOverloadDemo {
    public static void main(String[] args) {
        AddMethodOverload myObj = new AddMethodOverload();
        System.out.println("Sum 10 and 24 is " + myObj.add(10, 24));
        System.out.println("Sum of 10, 20 and 30 is " + myObj.add(10, 20, 30));
        System.out.println("Sum of 5.5 and 10.5 is " + myObj.add(5.5, 10.5));
    }
}
