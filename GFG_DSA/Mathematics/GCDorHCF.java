import java.util.Scanner;


public class GCDorHCF  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1; int num2;
        System.out.println("Input 2 numbers : ");
        num1 = sc.nextInt();
        num2  =sc.nextInt();
        System.out.println(gcd(num1, num2));
    }

   static int gcd(int a, int b){
       int result = Math.min(a,b);
       while(result>0){
           if(a%result==0 && b%result==0){
            break;
           }
           result--;
       }
       return result;

   }

  // ---------------------------------------------------------------

   static int gcd(int a, int b){
       while(a!=b){
           if(a>b)
               a=a-b;
           else
               b=b-a;

       }
       return a;
   }

  // ---------------------------------------------------------------
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
