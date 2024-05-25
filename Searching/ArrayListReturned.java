package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListreturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your elements in an array : ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target element : ");
        int target = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        result = findMultiple(arr, target, 0, new ArrayList<>());
        System.out.println(result);

    }

    static ArrayList<Integer> findMultiple(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length)
            return list;

        if(arr[index] == target)
            list.add(index);

        return findMultiple(arr, target, index+1, list);
    }
}
