package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int input = sc.nextInt();
        System.out.println(Nnatural(input));
    }
    
//    Approach 1 

    static int Nnatural(int n){
     return n*((n+1)/2);
    }
    
//    Approach 2 

    static int Nnatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
            sum = sum+i;
        return sum;
    }
    
//    Approach 3 

    static int Nnatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
                sum++;
        return sum;
    }
}
