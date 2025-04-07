package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{45, 68, 12, 9, 2, 678};

        for(int i = arr.length - 1; i >= 0; i--){

            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }

}
