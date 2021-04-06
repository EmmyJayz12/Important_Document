package com.dominic.algorithm;

public class DrawingBook2 {
    static int pageCount(int n, int p) {
        int x = p/2; int y= (n-p)/2; int z= n-p;
        if(p == 1) {
            return 0;
        }
        else if(x<y){
            return x;
        }
        else if(n%2 == 0 && (n-p)==1){
            return z;
        }
        else if(n%2 == 0 && x>y){
            return y;
        }
        else if(n%2 !=0 && x>y) {
            return y;
        }

        else {
            return x;
        }
    }
        public static void main(String[]args){
            System.out.println(pageCount(2, 1));
        }
    }

