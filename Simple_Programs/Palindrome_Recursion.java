package org.example;
import java.util.Scanner;

public class Main {
    static int sum=0;
    static int reverse(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        return digit * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = palindrome(number);
        System.out.println(result);
    }
}



