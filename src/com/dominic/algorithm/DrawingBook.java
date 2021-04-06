package com.dominic.algorithm;
import java.util.Collection;
import java.util.List;

public class DrawingBook {
    static int pageCount(int n, int p) {
        int counter = -1; int counter1=-1;

        for(int i=1; i<=n; i++) {
            counter++;
            if (i == p) {
                break;
            }
        }
            for(int j=n-1; j>=1; j--){
                counter1++;
                if(j==p){
                    break;
                }
            }

        if(counter<counter1) {
            return counter <=0 ? 0 : counter;
        }
        else {
          return counter1 <= 0 ? 0 : counter1;
        }

    }
    public static void main (String[]args){

        System.out.println(pageCount(7, 3));
    }
}
