package DAILY_DSA;
import java.util.Scanner;

public class computingPower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and it's power you want to calculate : ");
        int input = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(compute(input, power));
    }


    // Brute Force Approach
    // Time Complexity - O(n)
    // Space and Aux - O(1)
   static int compute(int input, int power){
       int result = 1;
       for(int i=1;i<=power;i++){
           result = result * power;
       }
       return result;
   }

    // Optimized Approach
    // Time Complexity - O(log(n))
    // Space and Aux - O(log(n)) - Recursive call stack
   static int compute(int input, int power){
       if(power==0)
           return 1;
       int temp = compute(input, power/2);
       temp = temp * temp;
       if(power%2 == 0)
           return temp;
       else
           return temp * input;
   }

    // Iterative Approach
    // Time Complexity - O(log(n))
    // Space and Aux - O(1)
    static int compute(int input, int power){
        int result = 1;
        while(power > 0){
            if(power % 2!=0){
                result = result * input;
            }
            input  = input * input;
            power = power/2;


        }
        return result;
    }

}
