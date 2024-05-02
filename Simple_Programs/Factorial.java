package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to get a factorial : ");
        int number = sc.nextInt();
        int factorial = Fact(number);
        System.out.println("Factorial : " + factorial);
    }

    static int Fact(int n){
        if(n<=1){
            return 1;
        }
        return n * Fact(n-1);
    }
}
