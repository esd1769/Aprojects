 ##Write a Java program,without using any builtins,that takes an integer array and a string as input,checks if the string are same as the array by comparing their integer
  #values.The program should print "empty" if the string is null, print "telling to watch X",where X is the part of the string that comes after 'watch,' in lowercase,
  #if the string contains "watch ", and print "no int" if the string contains any non-integer characters.
public class ArrayStringComparator {

    public static void main(String[] args) {
        // Example integer array and string input
        int[] array = {1, 2, 3, 4, 5}; // This can be modified as needed
        String inputString = "watch Youtube"; // Example input string (modify for testing)

        // Call the method to check the array and string
        checkArrayAndString(array, inputString);
    }

    static void checkArrayAndString(int[] arr, String str) {
        // Check if the string is null
        if (str == null) {
            System.out.println("empty");
            return;
        }

        // Check if the string starts with "watch " (case-insensitive)
        boolean startsWithWatch = true;
        String watchPrefix = "watch ";
        if (str.length() < watchPrefix.length()) {
            startsWithWatch = false;
        } else {
            for (int i = 0; i < watchPrefix.length(); i++) {
                char currentChar = str.charAt(i);
                char watchChar = watchPrefix.charAt(i);
                
                // Check if the characters match in a case-insensitive manner
                if (currentChar != watchChar && currentChar != watchChar - 32 && currentChar != watchChar + 32) {
                    startsWithWatch = false;
                    break;
                }
            }
        }

        if (startsWithWatch) {
            // Extract the part after "watch " and convert it to lowercase manually
            String partToWatch = str.substring(watchPrefix.length()); // Get substring after "watch "
            System.out.println("telling to watch " + convertToLowerCase(partToWatch));
            return;
        }

        // Check if the string contains only digits
        boolean isAllDigits = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') { // If any character is not a digit
                isAllDigits = false;
                break;
            }
        }

        if (!isAllDigits) {
            System.out.println("no int");
            return;
        }

        // Manually convert the string to an integer
        int inputValue = 0;
        for (int i = 0; i < str.length(); i++) {
            inputValue = inputValue * 10 + (str.charAt(i) - '0'); // Convert char to int
        }

        // Calculate the integer value represented by the array
        int arrayValue = 0;
        for (int num : arr) {
            arrayValue = arrayValue * 10 + num; // Build the integer from the array
        }

        // Compare the input value with the array value
        if (inputValue == arrayValue) {
            System.out.println("The input integer matches the array values.");
        } else {
            System.out.println("The input integer does not match the array values.");
        }
    }

    static String convertToLowerCase(String str) {
        StringBuilder lowerCaseStr = new StringBuilder(); // Using StringBuilder to construct the lower case string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Convert uppercase letters to lowercase by adding 32
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            lowerCaseStr.append(ch);
        }
        return lowerCaseStr.toString(); // Convert StringBuilder to String and return
    }
}
 ##Write a Java program,without using any builtins,that takes an integer array and a string as input,checks if the string are same as the array by comparing their integer
  #values.The program should print "empty" if the string is null, print "telling to watch X",where X is the part of the string that comes after 'watch,' in lowercase,
  #if the string contains "watch ", and print "no int" if the string contains any non-integer characters.
  
  public class StringArrayComparison {

    public static void main(String[] args) {
        // Example input
        int[] integerArray = {1, 2, 3, 4, 5}; // The integer array
        String inputString = "I am watching 1 2 3 4 5 now"; // The input string

        // Call the comparison method
        checkStringAgainstArray(integerArray, inputString);
    }

    // Method to check the string against the integer array
    public static void checkStringAgainstArray(int[] array, String str) {
        // Check if the string is null
        if (str == null) {
            System.out.println("empty");
            return;
        }

        // Check for the presence of "watch"
        int watchIndex = indexOfWatch(str);
        if (watchIndex != -1) {
            String partAfterWatch = extractPartAfterWatch(str, watchIndex);
            System.out.println("telling to watch " + partAfterWatch);
            return;
        }

        // Check for non-integer characters and build a string of integers
        String integerString = ""; // Will hold valid integers
        boolean hasNonInteger = false;

        // Manually process each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If character is a space or a digit, append it
            if (isDigit(c) || c == ' ') {
                integerString += c;
            } else if (c != '-') { // Allow negative sign at the start only
                hasNonInteger = true;
                break;
            }
        }

        // If there are non-integer characters, print "no int"
        if (hasNonInteger) {
            System.out.println("no int");
            return;
        }

        // Now we have a string of integers separated by spaces
        String[] parts = convertToStringArray(integerString);

        // Convert to integers and compare with the array
        int[] inputInts = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            inputInts[i] = convertStringToInt(parts[i]);
        }

        // Check if the input integers match the provided array
        if (array.length != inputInts.length) {
            System.out.println("The array and input integers do not match in length.");
            return;
        }

        boolean matches = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != inputInts[i]) {
                matches = false;
                break;
            }
        }

        // Print the result of the comparison
        if (matches) {
            System.out.println("The input string matches the integer array.");
        } else {
            System.out.println("The input string does not match the integer array.");
        }
    }

    // Helper method to check if a character is a digit
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9'; // Check if character is between '0' and '9'
    }

    // Helper method to find the index of the word "watch"
    private static int indexOfWatch(String str) {
        for (int i = 0; i <= str.length() - 5; i++) {
            if (str.substring(i, i + 5).equals("watch")) {
                return i;
            }
        }
        return -1; // Return -1 if "watch" is not found
    }

    // Helper method to extract the part after "watch "
    private static String extractPartAfterWatch(String str, int watchIndex) {
        int start = watchIndex + 5; // Length of "watch" is 5
        String result = ""; // To hold the part after "watch"
        
        // Manually build the substring
        for (int i = start; i < str.length(); i++) {
            result += str.charAt(i); // Append each character
        }
        
        // Trim the result and convert to lowercase manually
        return trimAndLowerCase(result);
    }

    // Helper method to trim spaces and convert to lowercase
    private static String trimAndLowerCase(String str) {
        // Trim leading spaces
        while (str.length() > 0 && str.charAt(0) == ' ') {
            str = str.substring(1);
        }
        // Trim trailing spaces
        while (str.length() > 0 && str.charAt(str.length() - 1) == ' ') {
            str = str.substring(0, str.length() - 1);
        }
        
        // Convert to lowercase
        String lowerCaseStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            lowerCaseStr += (c >= 'A' && c <= 'Z') ? (char) (c + ('a' - 'A')) : c; // Convert to lowercase
        }
        
        return lowerCaseStr;
    }

    // Helper method to convert a string to an array of strings based on spaces
    private static String[] convertToStringArray(String str) {
        String[] result = new String[10]; // Allocate array for maximum expected parts
        int count = 0;
        String current = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (current.equals("")) { // Check if current is empty
                    continue; // Skip spaces
                }
                result[count++] = current;
                current = "";
            } else {
                current += c;
            }
        }

        // Add the last part if it exists
        if (!current.equals("")) {
            result[count++] = current;
        }

        // Create the final array of the exact size
        String[] finalArray = new String[count];
        for (int i = 0; i < count; i++) {
            finalArray[i] = result[i];
        }
        return finalArray;
    }

    // Helper method to convert a string to an integer
    private static int convertStringToInt(String s) {
        int result = 0;
        boolean isNegative = false;
        int start = 0;

        // Check for negative sign
        if (s.length() > 0 && s.charAt(0) == '-') {
            isNegative = true;
            start = 1; // Start converting from the next character
        }

        // Convert each character to digit
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * 10 + (c - '0'); // Convert char to int
        }

        return isNegative ? -result : result; // Return negative if required
    }
}
 ##Write a Java program,without using any builtins,that takes an integer array and a string as input,checks if the string are same as the array by comparing their integer
  #values.The program should print "empty" if the string is null, print "telling to watch X",where X is the part of the string that comes after 'watch,' in lowercase,
  #if the string contains "watch ", and print "no int" if the string contains any non-integer characters.