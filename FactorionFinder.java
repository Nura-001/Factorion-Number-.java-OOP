import java.util.Scanner;

public class FactorionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (Start and End): ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Create an instance of FactorionCalculator
        FactorionCalculator calculator = new FactorionCalculator();

        // Find and display factorion numbers
        calculator.findFactorions(start, end);

        sc.close();
    }
}
