package com.basic.slidingwindow;

public class SlidingWindow {


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        System.out.println("Max sum of sub array of size " + k + " is: " + getSumValue(arr, k));
    }

    public static Integer getSumValue(int[] arr, int windowSize) {
        int arrSize = arr.length;
        int current = 0;
        for (int i=0; i < windowSize; i++){
            current += arr[i];
        }

        int maxx = current;

        for (int i=1; i < arrSize-windowSize; i++){
            current = maxx - arr[i-1] + arr[i+windowSize-1];
            if (current > maxx){
                maxx = current;
            }
        }
        return maxx;
    }
}
