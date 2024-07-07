package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input the nth Fibonacci : ");
        n = sc.nextInt();
        System.out.println(fib(n));
    }

   static int fib(int n){
       if(n<2)
           return n;
       return fib(n-1) + fib(n-2);
   }

// ------------------------------------------------------------

   static int fib(int n){
       if(n<=1) {
           return n;
       }
       int f[] = new int[n+1];
       f[0] = 0;
       f[1] = 1;
       for(int i=2;i<=n;i++){
           f[i] = f[i-1] + f[i-2];
       }
       return f[n];
   }

  // ------------------------------------------------------------

   static int fib(int n){
       if(n<=1)
           return n;
       
       int b=1; int a=0; int c = 0;
       for(int i=2;i<=n;i++){
           c=a+b;
           a=b;
           b=c;
       }
       return c;
   }
}
