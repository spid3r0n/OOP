public class WordCounter {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        
        String trimmedInput = input.trim();

        // Split by one or more whitespace characters
        String[] words = trimmedInput.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        // Possible cases
        String[] testStrings = {
            "Hello world",
            "   Java is  fun   ",
            "",
            "   ",
            "SingleWord",
            "Multiple   spaces   between   words",
            null
        };

        System.out.println("--- Word Counter Test Results ---");
        for (String test : testStrings) {
            int count = countWords(test);
            String displayTest = (test == null) ? "null" : "\"" + test + "\"";
            System.out.println(displayTest + " -> " + count + " words");
        }
    }
}
