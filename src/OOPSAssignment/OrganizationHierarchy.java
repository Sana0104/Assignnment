package OOPSAssignment;

class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateTotalSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    private double incentive;

    public Manager(String name, double baseSalary, double incentive) {
        super(name, baseSalary);
        this.incentive = incentive;
    }

    @Override
    public double calculateTotalSalary() {
        return super.calculateTotalSalary() + incentive;
    }
}

class Labour extends Employee {
    private double overTime;

    public Labour(String name, double baseSalary, double overTime) {
        super(name, baseSalary);
        this.overTime = overTime;
    }

    @Override
    public double calculateTotalSalary() {
        return super.calculateTotalSalary() + overTime;
    }
}

public class OrganizationHierarchy {
    public static void main(String[] args) {
        Employee employee1 = new Manager("John", 50000, 10000);
        Employee employee2 = new Labour("Alice", 30000, 2000);
        Employee employee3 = new Manager("Bob", 45000, 8000);


        double totalSalary = employee1.calculateTotalSalary() +
                employee2.calculateTotalSalary() +
                employee3.calculateTotalSalary();

        System.out.println("Total Salary of all Employees: " + totalSalary);
    }
}