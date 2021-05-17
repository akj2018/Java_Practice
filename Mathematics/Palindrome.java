/* 
    Problem : Find Palindrom of a given number
    Idea : Find the reverse of the given number and if reverse is same as the original number 
           then it is Palindrom otherwise not.  
    Complexity : Theta(No of digits)
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num))
            System.out.println("Is a Palindrome");
        else 
            System.out.println("Not a palindrome");
    }

    public static boolean isPalindrome(int num){
        int temp = num;
        int reversed = 0;
        while(temp!=0){
            int last_digit = temp % 10;
            temp = temp / 10;
            reversed = reversed*10 + last_digit;
        }
        System.out.println("Reversed Number: " + reversed);
        return num == reversed;
    }

    
}