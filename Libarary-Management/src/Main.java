import java.util.Scanner;

class Employee {

    private String name;
    private int id;
    private double hourlyRate;
    private double hoursWorked;

    public void setDetails(String name, int id, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee employee = new Employee();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter Hours Worked: ");
        double hoursWorked = scanner.nextDouble();

        employee.setDetails(name, id, hourlyRate, hoursWorked);

        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        scanner.close();
    }
}