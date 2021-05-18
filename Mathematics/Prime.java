/* 
    Problem : Check whether a number is prime or not
    Idea : 01. If number is divible by any other number apart from 1 and the number itself, then 
               the number is not prime. (check only from 2 to sqaure root of that number as rest of its 
               factors repeat after square root)

           02. if n is large, we need an efficient method,
               By Checking,
               -> if n % 2 == 0 , 
               -> if n % 3 == 0, 
               we can save many iterations

               so if n is not divisble by 2 then it cannot be divisble by 4,6,8,10,12,14,...
               and if n is not divisble by 3 then it cannot be divsible by 6,9,12,15,18,21,....

    Complexity :  01. O(squareRoot(n))
                  02. 1/3rd times faster than the previous approach
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " (Sqare Root Limit): " + (isPrime(num) ? "Prime" : "Not Prime"));
        System.out.println(num + " (6n + 1,6n - 1): " + (efficient_isPrime(num) ? "Prime" : "Not Prime"));

    }

    public static boolean isPrime(int num){
        if (num == 1)
            return false;

        for(int i=2;i*i<=num;i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean efficient_isPrime(int num){
        if (num == 1)
            return false;

        if (num == 2 || num == 3)
            return true;

        for(int i = 5; i*i <= num ; i = i + 6){
            if(num % i == 0 || num % (i+2) == 0)
                return false;
        }

        return true;
    }

}