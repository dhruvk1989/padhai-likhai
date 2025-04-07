package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{45, 68, 12, 9, 2, 678};

        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            boolean swapFlag = false;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                    swapFlag = true;
                }
            }

            if(swapFlag == false) break;

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

}
