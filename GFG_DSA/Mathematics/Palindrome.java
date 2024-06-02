import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(palindrome(input));
    }

    static int reverse(int n) {
        int rev = 0;
        int contain;
        if (n <= 9)
            return n;
        while (n > 0) {
            contain = n % 10;
            rev = rev * 10 + contain;
            n = n / 10;
        }
        return rev;
    }

    static boolean palindrome(int n) {
        if (n <= 9)
            return true;
        if(reverse(n) == n){
            return true;
        }
        else
            return false;

    }
}
