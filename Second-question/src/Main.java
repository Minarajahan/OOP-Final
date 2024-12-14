import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double currentPopulation = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (in percentage): ");
        double growthRate = scanner.nextDouble();

        double growthFactor = 1 + (growthRate / 100.0);

        for (int year = 1; year <= 3; year++) {
            currentPopulation = currentPopulation * growthFactor;
            System.out.printf("Estimated population in %d years: %.2f%n", year, currentPopulation);
        }

        scanner.close();
    }
}
