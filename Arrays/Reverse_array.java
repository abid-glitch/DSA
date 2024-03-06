Class Solution{
  public static void main(String[] args){
    int arr[] = {12, 34, 1, 67, 4};
    System.out.println(reverse_array(arr);
  }

  static void reverse_array(int arr[]){
    int start = 0;
    int end = arr.length-1;
    swap_element(arr, start, end);
    start++;
    end--;
  }

  static void swap_element(int[] arr, int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
