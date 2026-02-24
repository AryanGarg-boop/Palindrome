//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeManager {
    public static void main(String[] args) {    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("hello to the palindrome checker management system\nVersion : 1.0\nSystem initialized successfully.");

        String input = "madaw";
        String reversed = "";
        int palindrome = 0;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1)) {
                palindrome += 1;
            }
        }
        if (palindrome != 0) {
            System.out.println("Is it a palindrome? : True");
        } else {
            System.out.println("Is it a palindrome?: False");
        }

        System.out.println("-----------------------UC3-------------------");


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (reversed.equals(input)) {
            palindrome = 1;
        }


        if (palindrome != 0) {
            System.out.println("Is it a palindrome? : True");
        } else {
            System.out.println("Is it a palindrome?: False");
        }

        System.out.println("------------------------------UC4---------------------------");

        String input1 = "radar";

        // Convert the string into a character array.
        char[] chars = input1.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            // Compare characters at the current pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit loop if a mismatch is found
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        // --- LOGIC FROM IMAGE END ---

        // Display the validation result
        System.out.println("Input String: " + input1);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("----------------------------UC5-------------------------------");

        // Declare and initialize the input string.
        String input2 = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input2.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        isPalindrome = true;

        // Iterate again through original string to compare with popped values.
        for (char c : input2.toCharArray()) {
            // Pop from stack (LIFO gives the characters in reverse)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }


        String input3 = "nooni";

        // Create a Stack to store characters.
        Stack<Character> stack2 = new Stack<>();

        // 1. Push each character of the string into the stack.
        for (char c : input3.toCharArray()) {
            stack2.push(c);
        }

        // Assume palindrome initially.
        isPalindrome = true;

        // 2. Iterate again through original string.
        for (char c : input3.toCharArray()) {
            // Pop the character from the stack (this gives characters in reverse).
            char reverseChar = stack2.pop();

            // Compare original character with the reversed character.
            if (c != reverseChar) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found.
            }
        }

        System.out.println("----------------------------UC7-------------------------------");

        String input4 = "civic";

        // Create a Queue to store characters in FIFO (First-In, First-Out) order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO (Last-In, First-Out) order
        Stack<Character> stack3 = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack3.push(c);
        }

        // Flag to track palindrome status
        isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // queue.remove() takes from the FRONT (start of string)
            // stack.pop() takes from the TOP (end of string)
            if (queue.remove() != stack3.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("----------------------------UC7-------------------------------");

        String input5 = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input5.toCharArray()) {
            deque.add(c);
        }

        // Flag to track palindrome result
        isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove and compare characters from both ends
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("----------------------------UC8-------------------------------");

        String input6 = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list1 = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input6.toCharArray()) {
            list1.add(c);
        }

        // Flag to track palindrome state
        isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list1.size() > 1) {
            if (list1.removeFirst() != list1.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("----------------------------UC9-------------------------------");

        String input7 = "radar";
        boolean result = check(input7, 0, input7.length() - 1);
        System.out.println("Input: " + input7 + " | Result: " + result);

        System.out.println("----------------------------UC10-------------------------------");
        String input8 = "A man, a plan, a canal: Panama";

        // Preprocessing: Remove all non-alphanumeric characters and convert to lowercase
        String normalized = input8.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Assume the string is a palindrome initially
        isPalindrome = true;

        // --- LOGIC FROM HINT START ---
        // Compare characters from both ends moving towards the center
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }
        // --- LOGIC FROM HINT END ---

        // Output results
        System.out.println("Original String: " + input8);
        System.out.println("Normalized String: " + normalized);
        System.out.println("Result: Is it a palindrome? " + isPalindrome);


        System.out.println("----------------------------UC11-------------------------------");

// Create an instance of the service
        PalindromeService service = new PalindromeService();

        String input11 = "radar";

// 1. FIXED: You were storing this in result1 but checking 'result' below
        boolean result1 = service.checkPalindrome(input11);

        System.out.println("Input String: " + input11);

// 2. FIXED: Changed 'result' to 'result1' to match the service output
        if (result1) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }


        System.out.println("----------------------------UC12-------------------------------");
        String testInput = "radar";

        // Select the strategy (Stack-based)
        // This demonstrates the Strategy Design Pattern for interchangeable algorithms
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm
        boolean result12 = strategy.check(testInput);

        System.out.println("Strategy: Stack-based");
        System.out.println("Input: " + testInput);
        System.out.println("Result: Is it a palindrome? " + result12);
        // --- NEW UC12 LOGIC END ---



        System.out.println("----------------------------UC13-------------------------------");
        /**
         * Use Case 13: Performance Comparison
         * Measures and compares the execution performance of algorithms.
         */
        String input13 = "A man a plan a canal Panama";
        String normalized13 = input13.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use a palindrome strategy implementation
        PalindromeStrategy performanceStrategy = new StackStrategy();

        // 1. Capture execution start time
        long startTime = System.nanoTime();

        // 2. Execute the validation
        boolean result13 = performanceStrategy.check(normalized13);

        // 3. Capture execution end time
        long endTime = System.nanoTime();

        // 4. Calculate total execution duration
        long duration = endTime - startTime;

        // 5. Display benchmarking results
        System.out.println("Input String: " + input13);
        System.out.println("Strategy Used: StackStrategy");
        System.out.println("Result: " + result13);
        System.out.println("Execution Time: " + duration + " nanoseconds");

        System.out.println("---------------------------------------------------------------");

        // --- LOGIC FROM IMAGE END ---

        // Output results to console
        System.out.println("Input String: " + input3);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
}


interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Concrete implementation using a Stack (LIFO) behavior to reverse characters.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack (LIFO)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

