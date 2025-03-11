package com.example;


public class LearnBubbleSort {
    public static void main(String[] args) {

        int nums[] = {3, 67, 6, 10};
        int size = nums.length;
        int temp = 0;

        for (int num : nums) {
            System.out.println(num);
        }

        for (int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }

            }
        }

        for(int num : nums){
            System.out.println(num);
        }
    }
}
