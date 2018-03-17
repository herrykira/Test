package com.example.kinhangpoon.test;

/**
 * Created by KinhangPoon on 5/2/2018.
 */

public class Calculator {
    public int addTwoNum(int a, int b){
        return a+b;
    }
    public  int cube(int n){
        return n*n*n;
    }
    public String reverse(String s){
        char[] c = s.toCharArray();
        int left=0,right = c.length-1;
        while(left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return new String(c);
    }
}
