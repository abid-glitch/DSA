import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        bubbleSort(s);
        System.out.println("Sorted Array : " + Arrays.toString(s));
    }

    static void bubbleSort(String[] arr) {
        boolean swapped;
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
