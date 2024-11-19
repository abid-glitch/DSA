import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(prime(a));
    }


    static String prime(int n){
        if(n==1)
            return "not prime";

        for(int i=2;i<n;i++){
            if(n%i==0)
                return "not prime";
        }
        return "prime";
    }
}
