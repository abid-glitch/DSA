import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double currency = sc.nextDouble();


        NumberFormat UsC = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat InC = NumberFormat.getCurrencyInstance(new Locale("en", "In"));
        NumberFormat ChC = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat FrC = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + UsC.format(currency));
        System.out.println("India: " + InC.format(currency));
        System.out.println("China: " + ChC.format(currency));
        System.out.println("France: " + FrC.format(currency));

    }
}
