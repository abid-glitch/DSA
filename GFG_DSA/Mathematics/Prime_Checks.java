package org.example;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(IsPrime(a));
    }

---- Approach 1
   static boolean IsPrime(int n){ //O(n)
       if(n==1)
           return false;
       for(int i=2;i<n;i++){
           if(n%i==0)
               return false;
       }
       return true;
   }

---- Approach 2
   static boolean IsPrime(int n){  //- O(n*1/2)
       if(n==1)
           return false;
       for(int i=2;i*i<=n;i++){
           if(n%i==0)
               return false;
       }
       return true;
   }

---- Approach 3
   static boolean IsPrime(int n){ // - 0(n*1/2)
       if(n==1)
           return false;
       if(n==2 || n==3)
           return true;
       if(n%2==0 || n%3==0)
           return false;
       for(int i=5;i*i<n;i=(i+6)){
           if(n%i==0 || n%(i+2)==0)
               return false;
       }

       return true;
   }
    }
