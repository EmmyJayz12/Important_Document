package com.dominic.algorithm;
import java.util.List;
import java.util.ArrayList;

public class MinumStartValue {
    public static int minX(List<Integer> arr, int x) {
          int sum = x;
         for(int i = 0; i<arr.size(); i++){
             sum += arr.get(i);
             if(sum < 1){
                 break;
             }
         }
         return sum;
    }

    public static void main(String[]arg){
        List<Integer>arr = new ArrayList<>();
        arr.add(-5);
        arr.add(4);
        arr.add(-2);
        arr.add(3);
        arr.add(1);
//        arr.add(-1);
//        arr.add(-6);
//        arr.add(-1);
//        arr.add(0);
//        arr.add(5);
         int x = 6;
         System.out.println(minX(arr, x));
    }
}
