package com.dominic.algorithm;
import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    static int  birthday(List<Integer> s, int d, int m) {

        ArrayList<Integer> val = new ArrayList<>();
        int x = 0; int counter=0;
        while (x < s.size()){

            int count = 1;
            int y = 0;
            for (int i = x; i < s.size(); i++) {
                if (count <= m) {
                    y += s.get(i);
                    count++;
                }
            }
        val.add(y);
            x++;
    }
        for(int i=0; i<val.size(); i++){
            if(val.get(i) == d){
                counter++;
            }
        }

return counter;
    }
    public static void main(String[]args) {
        List<Integer> s = new ArrayList<>();
        s.add(1); s.add(1); s.add(1); s.add(1); s.add(1); s.add(1);
        System.out.println(birthday( s, 3, 2));
    }
}
