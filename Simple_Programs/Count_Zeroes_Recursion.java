package org.example;
import java.util.Scanner;

public class Main {
    static int count_zeroes(int n, int count){
        if(n==0)
            return count;
        int remainder = n%10;
        if(remainder == 0){
           return count_zeroes(n/10, count+1);
        }
        return count_zeroes(n/10, count);
    }

    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(count_zeroes(number, 0));
    }
}
