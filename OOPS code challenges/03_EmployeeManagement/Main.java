import java.util.ArrayList;
import java.util.List;

class Employee {
    private final int id;
    private final String name;
    private final String role;
    private final double monthlySalary;

    public Employee(int id, String name, String role, double monthlySalary) {
        if (id <= 0 || monthlySalary < 0) throw new IllegalArgumentException("Invalid employee data");
        this.id = id;
        this.name = name;
        this.role = role;
        this.monthlySalary = monthlySalary;
    }

    public int getId() { return id; }

    public void display() {
        System.out.printf("%d | %-12s | %-12s | Rs. %.2f/month%n",
                id, name, role, monthlySalary);
    }
}

class EmployeeManager {
    private final List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        if (findById(employee.getId()) != null) {
            throw new IllegalArgumentException("Employee ID already exists");
        }
        employees.add(employee);
    }

    public Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) return employee;
        }
        return null;
    }

    public void listAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        employees.forEach(Employee::display);
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.add(new Employee(1, "Maya", "Developer", 45000));
        manager.add(new Employee(2, "Kabir", "Tester", 38000));
        System.out.println("EMPLOYEE LIST");
        manager.listAll();
        System.out.println("Search ID 2: " +
                (manager.findById(2) != null ? "Found" : "Not found"));
    }
}
