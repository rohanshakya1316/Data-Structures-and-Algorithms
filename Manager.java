public class Manager extends Employee {
    private static final double MANAGER_BONUS = 300.0;

    public Manager(int id, String name, String department, double salary, String designation) {
        super(id, name, department, salary, designation);
    }

    @Override
    public double addBonus() {
        return getSalary() + MANAGER_BONUS;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total Salary with Bonus: " + addBonus());
    }
}
