package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers in an array : ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to be found : ");
        int target = sc.nextInt();
        System.out.println(LinearSearch(arr, target, 0));
    }

    static int LinearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target)
            return index;

        else
           return LinearSearch(arr, target, index+1);
    }
}
