package com.example;

public class SelectionSort {
    public static void main(String[] args) {
         int numbers[] = {6, 9, 190, 100};
         int size = numbers.length;
         int minIndex = 0;
         int temp = 0;

        System.out.println("before sorting");
        for(int num : numbers){//for enhancement loop iterates over array
            System.out.println(num);
         }

         for(int i = 0; i<size - 1; i++){//size - 1 because it is not neccessary to iterates over last one number
             minIndex = i;
             for(int j = i+1; j<size; j++){
             if (numbers[minIndex] > numbers[j]){
                     minIndex = j;
                 }

                 temp = numbers[minIndex];
                 numbers[minIndex] = numbers[j];
                 numbers[j] = temp;
             }

         }
        System.out.println("after sorting");
        for(int num : numbers){
             System.out.println(num);
         }

    }


}
