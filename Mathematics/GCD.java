/* 
    Problem : Greatest Common Divisor
    Problem : Find the largest sqaure tile that can cover a rectangle of size m X n
    Idea : If g is the gcd if a and b then, a = g * t1 , b = g * t2 and GCD (t1, t2) = 1
            so if a - b = k(t1 - t2) then GCD(b, a - b) is also the same
            Therefor gcd(b, a-b) = gcd(a,b)
    Complexity : log(min(a,b))
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println("GCD(" + num_1 + "," + num_2 + ") (Unoptimized) : " + gcd_unoptimized(num_1,num_2));
        System.out.println("GCD(" + num_1 + "," + num_2 + ") (Opti-Iterative) : " + gcd_itr(num_1,num_2));
        System.out.println("GCD(" + num_1 + "," + num_2 + ") (Opti-Recursive) : " + gcd_recr(num_1,num_2));

    }

    // EUCLIDIEAN ALGORITHM
    public static int gcd_unoptimized(int m , int n){
        while(m != n){
            if (m>n)
                m = m - n;
            else 
                n = n - m;
        }
        return m;
    }

    // OPTIMIZED EUCLIDEAN ALGORITHM (Iterative)
    public static int gcd_itr(int m, int n){
        int temp = 0;
        while(m%n != 0){
            temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

    // OPTIMIZED ECULIDEAN ALGORITHM (Recursive)
    public static int gcd_recr(int m, int n){
        if (n==0)
            return m;
        return gcd_recr(n, m%n);
    }
}