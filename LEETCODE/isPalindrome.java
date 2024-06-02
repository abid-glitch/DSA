class Solution {
    public boolean isPalindrome(int n) {
        int contain;
        int reverse=0;
        if(n<0)
        return false;
        if(n<=9)
        return true;
        int temp = n;
        while(temp>0){
          contain = temp%10;
          reverse = reverse*10+contain;
          temp = temp/10;  
        }
        if(reverse == n)
        return true;
        else
        return false;
        
    }
}
