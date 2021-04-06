package com.dominic.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TwoSet {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int max = b.get(0);
        int count = 0;
        ArrayList<Integer> val = new ArrayList<>();

        for (int i = 0; i < b.size(); i++) {
            if (max < b.get(i)) {
                max = b.get(i);
            }
        }

        for (int i = 1; i <= max; i++) {
            boolean flag = true;
            boolean flag2 = true;
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                for (int k = 0; k < b.size(); k++) {
                    if (b.get(k) % i != 0) {
                        flag2 = false;
                        break;
                    }
                }
                if (flag2 == true) {
                    count++;
                }
            }
            }

            return count;
        }
        public static void main (String[]args){
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            a.add(1);
            b.add(100);
            // a.add(24); a.add(36);

            System.out.println(getTotalX(a, b));
        }
    }


