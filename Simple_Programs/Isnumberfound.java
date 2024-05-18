package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers in array : ");
        int input = sc.nextInt();
        int[] arr = new int[input];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter which number to search : ");
        int target = sc.nextInt();
        System.out.println(Isnumberfound(arr, target, 0));

    }

    static boolean Isnumberfound(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target)
            return true;

        else
            return arr[index] == target || Isnumberfound(arr, target, index+1);
    }
}
