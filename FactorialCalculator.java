import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the entered number
        long factorial = calculateFactorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
    /**
     * Prompts the user to enter a non-negative integer and validates the input.
     * Continues prompting until a valid non-negative integer is provided.
     *
     * return a valid non-negative integer.
     */
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        
        // Loop until a valid non-negative integer is entered
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                if (number < 0) {
                    System.out.println("Error: The number must be non-negative. Please try again.");
                }
            } else {
                // If the input is not an integer, display an error message and clear the invalid input
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // discard the invalid token
            }
        }
        
        return number;
    }
    
    /**
     * Calculates the factorial of the given non-negative integer.
     * Uses a loop to multiply numbers from 1 to n (inclusive).
     *
     * param n the non-negative integer for which to calculate the factorial.
     * return the factorial of n.
     */
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        long factorial = 1;
        // Multiply numbers from 1 to n to get the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
