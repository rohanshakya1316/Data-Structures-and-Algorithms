public class Main2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Kamal Thakur", "Medical", 2500.0, "Doctor");
        Manager mgr1 = new Manager(2, "Joeshep Kardos", "Engineering", 7500.0, "Manager");
        Clerk clk1 = new Clerk(3, "Harry Smith", "Administration", 4000.0, "Clerk");

        System.out.println("Employee Details:");
        emp1.display();
        System.out.println();

        System.out.println("Manager Details:");
        mgr1.display();
        System.out.println();

        System.out.println("Clerk Details:");
        clk1.display();
        System.out.println();

        int leaveDays = 3;
        System.out.println("Calculating deductions for leave days: " + leaveDays);
        System.out.println("Employee Salary after Deductions: " + emp1.calculateDeductions(leaveDays));
        System.out.println("Manager Salary after Deductions: " + mgr1.calculateDeductions(leaveDays));
        System.out.println("Clerk Salary after Deductions: " + clk1.calculateDeductions(leaveDays));
    }
}
