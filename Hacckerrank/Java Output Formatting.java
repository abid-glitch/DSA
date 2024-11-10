import java.util.*;
import java.util.Scanner;
public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=""; int n=0;
        System.out.println("================================");

        for(int i=0;i<3;i++){
            s = sc.next();
            n = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, n);
        }
System.out.println("================================");



    }
}



