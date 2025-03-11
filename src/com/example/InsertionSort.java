package com.example;

public class InsertionSort {
    public static void main(String[] args) {

     int nums[] = {34, 21, 98, 100};

     for(int i=1 ; i< nums.length ; i++){
         int key = i;
         int j = i-1; // here j is placed infront of i

         while(j>=0 && nums[j] > key){ //here check the value j > 0 or the number in j > number in key
             nums[j+1] = nums[j];//start shifting
               j--;
         }
             nums[j+1] = key; //finally assign the j+1 position with key

         }
     for(int num : nums){
         System.out.println(num);// here print the output
     }

    }
}
