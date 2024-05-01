package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 99748873;
        int count = count(number);
        System.out.println(count);
    }

    static int count(int num){

        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
