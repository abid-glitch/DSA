package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        int count = count(number);
        System.out.println("Digit Count : " + count);
    }

    static int count(int num){

        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
