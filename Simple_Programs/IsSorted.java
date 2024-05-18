package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements in an array : ");
        int input = sc.nextInt();
        int arr[] = new int[input];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Issorted(arr, 0));
    }


    static boolean Issorted(int[] arr, int index){
        if(arr[index] == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Issorted(arr, index+1);
    }
}
