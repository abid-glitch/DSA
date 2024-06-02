import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fact(input));
    }

    static int fact(int n){
        int result=1;
        if(n==0 || n==1)
            return n;
        for (int i=2;i<=n;i++){
            result *= i;
        }
        return result;
    }

}


