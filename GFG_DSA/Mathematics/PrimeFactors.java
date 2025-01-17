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
}
