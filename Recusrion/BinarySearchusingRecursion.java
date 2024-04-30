public class Main {
    public static void main(String[] args) {
        int[] arr = {3,22,56,77,89};
        int target = 22;
        System.out.println(Binary(arr, target, 0, arr.length-1));
    }

    static int Binary(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }

        int middle = start + (end - start) / 2;

        if(arr[middle] == target){
            return middle;
        }

        if(arr[middle] > target){
            return Binary(arr, target, start, middle-1);
        }
        return Binary(arr, target, middle+1, end);

    }
}
