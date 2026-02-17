//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("hello to the palindrome checker management system\nVersion : 1.0\nSystem initialized successfully.");

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
