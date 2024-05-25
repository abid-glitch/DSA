package org.example;
import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array : ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter target element : ");
        int target = sc.nextInt();
        System.out.println(Rbinarysearch(arr, target, 0, arr.length-1));
    }

    static int Rbinarysearch(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int middle = start + (end - start) / 2;

        if (arr[middle] == target) {
            return middle;
        }

        if (arr[start] <= arr[middle]) { // sorted
            if (target >= arr[middle] && target <= arr[middle]) { //element found
                return Rbinarysearch(arr, target, start, middle - 1);
            }
            return Rbinarysearch(arr, target, middle + 1, end);
        }

        if (target >= arr[middle] && target <= arr[end]) { //element found
            return Rbinarysearch(arr, target, middle + 1, end);
            }
        return Rbinarysearch(arr, target, start, middle - 1);

    }
    }
