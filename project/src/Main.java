//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("hello to the palindrome checker management system\nVersion : 1.0\nSystem initialized successfully.");

    String input = "madaw";
    String reversed = "";
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

    System.out.println("-----------------------UC3-------------------");



    for (int i = input.length()-1; i >= 0; i--){
        reversed += input.charAt(i);
    }
    if (reversed.equals(input)){
        palindrome = 1;
    }


    if(palindrome!=0){
        System.out.println("Is it a palindrome? : True");
    }
    else{
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
}
