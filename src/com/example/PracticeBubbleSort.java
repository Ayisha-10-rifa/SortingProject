package com.example;

public class PracticeBubbleSort {
    public static void main(String[] args) {
        int numbers[] = {23, 98, 45, 78, 100};
        int size = numbers.length;
        int temp = 0;


        System.out.println("before sorting");
        for(int number : numbers){
            System.out.println(number);
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){

                if(numbers[j]>numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

        }
        System.out.println("after sorting");
        for(int number : numbers){
            System.out.println(number);
        }
    }

}
