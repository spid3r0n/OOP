public class ExceptionHandlingDemo {

    // Method that might throw an exception
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    // Method that reads an array element (may throw ArrayIndexOutOfBoundsException)
    public static int getElement(int[] arr, int index) {
        return arr[index];
    }

    public static void main(String[] args) {

        // --- Example 1: try-catch-finally ---
        System.out.println("=== Example 1: ArithmeticException ===");
        try {
            int result = divide(10, 0);         // This will throw
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("'finally' always runs, no matter what.\n");
        }

        // --- Example 2: Multiple catch blocks ---
        System.out.println("=== Example 2: Multiple Catch Blocks ===");
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(getElement(numbers, 5));  // Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: Invalid array index — " + e.getMessage());
        } catch (Exception e) {
            // Generic catch-all (must come last)
            System.out.println("Caught a general exception: " + e.getMessage());
        }

        // --- Example 3: Custom Exception ---
        System.out.println("\n=== Example 3: Custom Exception ===");
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        System.out.println("\nProgram continues normally after handling exceptions.");
    }

    // Custom exception example
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        System.out.println("Valid age: " + age);
    }
}

// Defining a custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

**Output:**
```
=== Example 1: ArithmeticException ===
Caught exception: Cannot divide by zero!
'finally' always runs, no matter what.

=== Example 2: Multiple Catch Blocks ===
Caught: Invalid array index — Index 5 out of bounds for length 3

=== Example 3: Custom Exception ===
Caught custom exception: Age cannot be negative: -5

Program continues normally after handling exceptions.
