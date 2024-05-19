package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;

public class MultipleOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array : ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter target number : ");
        int target = sc.nextInt();

        Multipleoccurrenceofnumbers(arr, target, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void Multipleoccurrenceofnumbers(int[] arr, int target, int index){
        if(index == arr.length)
            return;

        if(arr[index] == target)
            list.add(index);

        Multipleoccurrenceofnumbers(arr, target, index+1);
    }
}
