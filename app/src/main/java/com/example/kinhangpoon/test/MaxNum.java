package com.example.kinhangpoon.test;

/**
 * Created by KinhangPoon on 5/2/2018.
 */

public class MaxNum {
    public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
