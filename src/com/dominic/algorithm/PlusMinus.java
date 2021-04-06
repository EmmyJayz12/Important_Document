package com.dominic.algorithm;

public class PlusMinus {
    public  static void plusMinus(int[] arr){
        float x =0, y = 0, z=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                y++;
            }
            else if(arr[i]>0){
                x++;
            }
            else if(arr[i]==0) {
                z++;
            }
        }
        float b = 5;
        float minus = x/arr.length ; float zero=z/arr.length; float positive=y/arr.length;


        System.out.println(String.format("%f", minus));
        System.out.println(String.format("%f", positive));
        System.out.println(String.format("%f", zero));
}
public static void main (String[] args){
         int[] arr = {-4, 3, -9, 0, 4, 1 };
    plusMinus(arr);
    }
}
