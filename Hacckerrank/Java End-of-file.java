import java.util.*;
import java.util.Scanner;

public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bullet = 1;
        
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(bullet + " " + s);
            bullet ++;
        }
    }
}
