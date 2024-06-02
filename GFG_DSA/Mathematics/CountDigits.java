import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
       System.out.println(countdigits(input));
    }

    static int countdigits(int n){
        int count=0;
        if(n==0)
            return 1;
       while(n>0){
           n = n/10;
           count++;
       }

        return count;
    }
}
