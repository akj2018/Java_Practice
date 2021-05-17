/* 
    Problem : Lowest Commn Multiple
    Idea : 01. Start with the max of both the numbers and keep on incrementing till you find a number
               which is divisible by both the numbers a, b.

           02. LCM(a,b) * HCF(a,b) = a * b
               LCM(a,b) = (a * b) / HCF(a,b)

    Complexity : 01. O(m*n - max(m,n))
                 02. O(log(min(a,b)))   
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM(" + a + "," + b +") (Euclidean) : " + lcm(a,b));
        System.out.println("LCM(" + a + "," + b +") (Long Method) : " + lcm_unoptimized(a,b));
    }

    public static int lcm_unoptimized(int a, int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a == 0 && res%b == 0){
                break;
            }
            res++;
        }
        return res;
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd_optimized(a,b);
    }

    public static int gcd_optimized(int a, int b){
        if (b == 0){
            return a;
     }

        return gcd_optimized(b, a%b);
    }
}