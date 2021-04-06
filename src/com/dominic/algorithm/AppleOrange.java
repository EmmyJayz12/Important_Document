package com.dominic.algorithm;

import java.util.ArrayList;

public class AppleOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int app = 0;
        int o = 0;
        for (int i = 0; i < apples.length; i++) {
            int x= (apples[i] + a);
            if(x>=s && x<=t){
                app++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int y = (oranges[i] + b);
            if(y>=s && y<=t){
                o++;
            }
        }

        System.out.println(app);
        System.out.println(o);
    }
    public static void main(String[] args){
        int[] apples = {2};
        int[] oranges = {-2};
        countApplesAndOranges(2, 3, 1, 5,  apples,  oranges);
    }
}
