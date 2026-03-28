import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        // Convert string to lowercase to simplify comparison
        String lowerInput = input.toLowerCase();

        // Check each character
        for (int i = 0; i < lowerInput.length(); i++) {
            char c = lowerInput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
