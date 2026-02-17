/**
 * =========================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */

import java.util.Scanner;
public class UseCase2PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madaw";
        int palindrome = 0;

        for (int i = 0; i < input.length()/2; i++){
            if(input.charAt(i) == input.charAt(input.length()-1)){
                palindrome +=1;
            }
        }
        if(palindrome!=0){
            System.out.println("Is it a palindrome? : True");
        }
        else{
            System.out.println("Is it a palindrome?: False");
        }


    }
}