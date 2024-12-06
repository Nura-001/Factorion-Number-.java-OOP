public class FactorionCalculator {

    // Method to calculate factorial of a digit
    private int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a factorion
    public boolean isFactorion(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to find all factorion numbers in a range
    public void findFactorions(int start, int end) {
        int count = 0;
        System.out.println("Factorion numbers within the range:");
        for (int i = start; i <= end; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of factorions within the range: " + count);
    }
}
