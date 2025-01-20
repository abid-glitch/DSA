package DAILY_DSA;
import java.util.Scanner;
public class SieveEratosthenes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        SieveEratoesthenes(input);
    }

    static boolean IsPrime(int n){
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }

    // Time Complexity - O(n)
    // Space and Aux  - O(1)
//    static void prPrime(int input){
//     for(int i=2;i<=input;i++){
//         if(IsPrime(i)){
//             System.out.print(i+ " ");
//         }
//     }
//    }

    // Optimized Approach 
    // Time Complexity - O(n.log(log(n))) - p increases number of iterations decreases
    // Space and Auz - O(n) - Space needed to store the boolean array
    static void SieveEratoesthenes(int input){
        boolean[] isPrime = new boolean[input+1];

        for(int i=2;i<=input;i++){
            isPrime[i]  = true;
        }

        for(int p=2;p*p<=input;p++){
            if(isPrime[p]){
                for(int div = p*p; div<= input; div = div+p){
                    isPrime[p] = false;
                }
            }
        }

        for(int i=2; i<= input;i++){
            if(isPrime[i])
                System.out.print(i + " ");
        }
    }
}

