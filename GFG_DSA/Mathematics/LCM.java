import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to calculate lcm : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }

   static int lcm(int a, int b){
       int res = Math.max(a,b);
       while(true){
           if(res%a == 0 && res%b == 0){
               break;
           }
           res++;
       }
       return res;
   }

  // ---------------------------------------------
  
    static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
