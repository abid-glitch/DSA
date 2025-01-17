public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get Prime Factors: ");
        int input = sc.nextInt();
        primefactor(input);
    }
    
    // Time Complexity - O(input) - The loop will run till n-2 times
    // Space and Aux - O(1)
   static void primefactor(int input){
       for(int i=2;i<input;i++){
           while(input%i==0){
               System.out.print(i + " ");
               input = input/i;
           }
       }
       if(input > 1)
           System.out.println(input);
   }

    // Optimized Version
    //Time Complexity - O(n^(1/2))
    // Space and Aux - O(1)
    static void primefactor(int input){
        for(int i=2;i*i<input;i++){
            while(input%i==0){
                System.out.print(i + " ");
                input = input/i;
            }
        }
        if(input > 1)
            System.out.println(input);
    }

        // More Optimized Version
    // Time Complexity - O(n^(1/2))
    // Space and Aux - O(1)
    static void primefactor(int input){
        if(input<=1)
            System.out.println("Don't have any primefactors");
        while(input%2==0) {
            System.out.println("2");
            input = input/2;
        }
        while(input%3==0){
            System.out.println("3");
            input = input/3;
        }
        for(int i=5;i*i<=input;i=i+6){
            while(input%i==0){
                System.out.println(i);
                input = input/i;
            }
            while(input%(i+2)==0){
                System.out.println(i+2);
                input = input/(i+2);
            }
        }
        if(input > 3)
            System.out.println(input);
    }
}
