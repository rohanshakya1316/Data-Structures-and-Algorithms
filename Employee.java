public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String designation;
    private static final double DEFAULT_BONUS = 200.0;

    public Employee(int id, String name, String department, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return designation.equals(employee.designation);
    }

    public double addBonus() {
        return salary + DEFAULT_BONUS;
    }
    public double calculateDeductions(int leaveDays) {
        double dailyRate = salary / 20; // Assuming 20 working days per month
        return salary - (leaveDays * dailyRate);
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
