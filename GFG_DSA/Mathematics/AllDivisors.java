package DAILY_DSA;
import java.util.Scanner;
public class AllDivisors {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get all divisors : ");
        int input = sc.nextInt();
        Divisor(input);

    }

    // Brute Force Method
    // time Complexity - O(n)
    // Space and Aux - O(1)
//    static void Divisor(int input){
//        if(input<1)
//            System.out.println("Invalid input");
//        for(int i=1;i<=input;i++){
//            if(input%i==0)
//            System.out.print(i + " ");
//        }
//    }



    // Give output in un-sorted order
    // Time Complexity - O(n^(1/2))
    // Space and Aux - O(1)
    static void Divisor(int input) {
        if (input < 1) {
            System.out.print("Invalid input");
            return;
        }

        for (int i = 1; i * i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
                if (i != input / i) {
                    System.out.print(input / i + " ");
                }
            }
        }
    }



// Sorted Order
    // Time Complexity - O(n^(1/2))
    // Space and Aux - O(1)
    static void DivisorSorted(int input) {
        if (input < 1) {
            System.out.print("Invalid input");
            return;
        }

        // First pass: Print smaller divisors
        for (int i = 1; i * i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
        for (int i = (int) Math.sqrt(input); i >= 1; i--) {
            if (input % i == 0 && i != input / i) {
                System.out.print(input / i + " ");
            }
        }
    }


}
