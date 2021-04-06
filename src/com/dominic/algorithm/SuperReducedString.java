package com.dominic.algorithm;

import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperReducedString {
    static String superReducedString(String s) {
        char[] val = new char[s.length()];
        String res = "";
            for(int i=0; i<s.length(); i++){
              val[i] = s.charAt(i);
                }
        //Arrays.sort(val);
            for(int j=0; j<val.length; j++){
                if(j+1 >= val.length){
                    res += val[j];
                    return res;
                }

                if(val[j] == val[j+1]){
                    j++;
                }
               else {
                    res += val[j];
                }
            }

            return res == "" ? "Empty String" : res;
    }
    public static void main(String[]args){
        System.out.println(superReducedString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
    }
}
