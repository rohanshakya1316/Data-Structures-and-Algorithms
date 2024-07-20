public class CountObject {
    static int ObjNum = 0;
    CountObject() {
        ObjNum++;
    }
    static int ObjectCounter() {
        return ObjNum;
    }
    public static void main(String[] args) {
        CountObject obj1 = new CountObject();
        CountObject obj2 = new CountObject();
        CountObject obj3 = new CountObject();
        CountObject obj4 = new CountObject();
        CountObject obj5 = new CountObject();
        CountObject obj6 = new CountObject();
        CountObject obj7 = new CountObject();
        System.out.println("Total Objects created is " + ObjectCounter());
    }
}
