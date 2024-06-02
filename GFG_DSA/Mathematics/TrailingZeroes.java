import java.util.Scanner;

public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(zeroescount(input));
        System.out.println(zeroescount1(input));
    }


    //Approach1
    static int zeroescount(int n){
        int result = 1;
        if(n==0 || n==1)
            return 1;
        for(int i=2;i<=n;i++){
            result *= i;
        }

        int count=0;
        while(result%10 == 0){
            count++;
            result = result/10;
        }
        return count;
    }

    //Approach2
    static int zeroescount1(int n){
        if(n<5)
            return -1;
        int result = 0;
        for(int i=5;i<=n;i=i*5){
            result = result + n/i;
        }
        return result;
    }
}
