import java.util.Scanner;


public class StarPatter_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display a star pattern : ");
        int input = sc.nextInt();
        pattern(input);
    }


// Pattern 1 

    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");}

        System.out.println();}
    }

// Pattern 2 


    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
        System.out.println();}
    }

// Pattern 3   

    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
        System.out.println();
        }
    }

// Pattern 4 
  
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
        System.out.println();
        }
    }

// Pattern 5
  
    static void pattern(int n) {
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("*");
        }
    System.out.println();
    }
    for(int row=1;row<=n;row++){
        for(int col=n;col>=row;col--){
            System.out.print("*");
        }
    System.out.println();
    }
    }

// Pattern 6
  
        static void pattern(int n) {
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("*");
        }
    System.out.println();
    }

    for(int row=1;row<=n;row++){
        for(int col=n;col>=row;col--){
            System.out.print("*");
        }
    System.out.println();
    }


    }


}
