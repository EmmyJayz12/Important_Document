package com.dominic.algorithm;

public class RemoveCharacterFromString {
    public static int sequenceSum(int i, int j, int k) {
        int val = i; int y=1;
        int val1 = 0; int result = val;
        for (int x = 1; x <= j; x++) {

            if (val == j) {
                break;
            }
            else {
                val += y;
                result +=val;
            }

        }
        for(int x=1; x<=k || x>=k; x++){

            if(val == k){
                break;
            }
            else {
                val -=y;
                result +=val;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sequenceSum(6,6, 6));
    }

}
