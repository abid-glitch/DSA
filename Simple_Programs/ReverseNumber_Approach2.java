package org.example;
import java.util.Scanner;

public class Approach_2 {

    static int reverse(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int remainder = n%10;
        return remainder * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(reverse(number));
    }

}
