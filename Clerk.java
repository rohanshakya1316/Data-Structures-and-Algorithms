public class Clerk extends Employee {
    private static final double CLERK_BONUS = 100.0;

    public Clerk(int id, String name, String department, double salary, String designation) {
        super(id, name, department, salary, designation);
    }

    @Override
    public double addBonus() {
        return getSalary() + CLERK_BONUS;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total Salary with Bonus: " + addBonus());
    }
}
