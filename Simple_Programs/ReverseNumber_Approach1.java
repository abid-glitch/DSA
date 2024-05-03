package org.example;
import java.util.Scanner;

public class Main {
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverse(number);
        System.out.println(sum);
    }
}
