/* 
    Problem : Find trainling zeroes in factorial of a number
    Idea : How many 2's and 5's are there in the prime factorization of the number. 
            Since number of 5's are always going to be lesser than 2's, so we only need to count
            number of 5's in the given prime factorization of the number.

            1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15......
            so we can see that every 5th number has 5 as a prime factor, (5,10,15...)
            But numbers like 25 have more than 1 prime factors so,
            25 = (25,50,75,100,...)

            [num/5] + [num/25] + [num/125] + ....
            [numbers containing 1 factor as 5] + [numbers containing 2 factors as 5] + 
            [numbers containing 3 factors as 5] 
    -----------------------------------------------------------------------------------------
    Iterative
    Time Complexity : log5(n) | pow(k,5) <= n, so taking log both sides k <= log5(n)
    Auxillary Space Complexity : theta(1)

*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Trailing Zeroes in " + num + "! : " + trailing_zeroes(num));
    }

    public static int trailing_zeroes(int num){
        int factor = 5;
        int ans = 0;
        while(factor <= num){
            ans = ans + num/factor;
            factor = factor * 5;
        }
        return ans;
    }
}