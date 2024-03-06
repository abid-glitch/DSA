Class Solution{
  public static void main(String[] args){
    int arr[] = {34,2,55,78,11};
    System.out.println(max_element(arr));
    
  }

  static int max_element(int[] arr){
    int start_max = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i] > start_max){
        start_max = arr[i];
      }
    } 
    return start_max;
  }
}
