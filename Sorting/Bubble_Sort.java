package org.example;

import java.util.Arrays;

import static org.example.Main.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,77,3,1,55,98};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void BubbleSort(int[] arr){
        boolean swapped;
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
        }
        }
    }
}

//
//// x=2, y=3
//temp = x //temp=2
//x = y; // x=3
//y = temp // y =2


