import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("Number of Digits (Iterative) : " + count_digit_itr(num));
        System.out.println("Number of Digits (Recursive) : " + count_digit_recur(num));
        System.out.println("Number of Digits (Logarithmic) : " + count_digit_log(num));
    }

    public static int count_digit_log(long num){
        return (int)(Math.floor(1 + Math.log10(num)));
    }

    public static int count_digit_itr(long num){
        int count = 0;
        while(num!=0){
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int count_digit_recur(long num){
        if (num == 0)
            return 0;

        return 1 + count_digit_itr(num/10);
    }
}`