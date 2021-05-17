/* 
    Problem : Find Factorial of a give number
    Idea : Finmultiply with the previous smaller numbers to obtain n!
    -----------------------------------------------------------------------------------------
    Iterative
    Time Complexity : theta(n)
    Auxillary Space Complexity : theta(1)
    -----------------------------------------------------------------------------------------
    Recursive (number >= 0)
    Time Complexity : theta(n)
    Auxillary Space Complexity : theta(n)

*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + "! (Iterative) = " + factorial_itr(num));
        System.out.println(num + "! (Recursive) = " + facotrial_recr(num));
    }

    public static long factorial_itr(int num){
        long ans = 1;
        for(int i=2;i<=num;i++){
            ans = ans*i;
        }
        return ans;
    }

    public static long facotrial_recr(int num){
        if (num == 0 || num == 1)
            return 1;
        
        return (long)(num * facotrial_recr(num - 1));
    }
}