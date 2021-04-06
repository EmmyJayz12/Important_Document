package com.dominic.algorithm;

import java.util.ArrayList;
import java.util.List;
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> val = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                val.add(grades.get(i));
            }
            else if(grades.get(i)>=38 && grades.get(i)<=40 && (40 - grades.get(i)) <3){
                val.add(40);
            }
            else if (grades.get(i) >= 40 && grades.get(i) <= 45 && (45 - grades.get(i)) < 3) {
                val.add(45);
           }
            else if (grades.get(i) > 45 && grades.get(i) <= 50 && (50 - grades.get(i)) < 3) {
                val.add(50);
            }
            else if (grades.get(i) > 50 && grades.get(i) <= 55 && (55 - grades.get(i)) < 3) {
                val.add(55);
            }
            else if (grades.get(i) > 55 && grades.get(i) <= 60 && (60 - grades.get(i)) < 3) {
                val.add(60);
            }
            else if (grades.get(i) > 60 && grades.get(i) <= 65 && (65 - grades.get(i)) < 3) {
                val.add(65);
            }
            else if (grades.get(i) > 65 && grades.get(i) <= 70 && (70 - grades.get(i)) < 3) {
                val.add(70);
            }
            else if (grades.get(i) > 70 && grades.get(i) <= 75 && (75 - grades.get(i)) < 3) {
                val.add(75);
            }
            else if (grades.get(i) > 75 && grades.get(i) <= 80 && (80 - grades.get(i)) < 3) {
                val.add(80);
            }
            else if (grades.get(i) > 80 && grades.get(i) <= 85 && (85 - grades.get(i)) < 3) {
                val.add(85);
            }
            else if (grades.get(i) > 85 && grades.get(i) <= 90 && (90 - grades.get(i)) < 3) {
                val.add(90);
            }
            else if (grades.get(i) > 90 && grades.get(i) <= 95 && (95 - grades.get(i)) < 3) {
                val.add(95);
            }
            else if (grades.get(i) > 95 && grades.get(i) <= 100 && (100 - grades.get(i)) < 3) {
                val.add(100);
            } else {
                val.add(grades.get(i));
            }
        }

            return val;
        }
        public static void main (String[]args){
            List<Integer> grades = new ArrayList<>();
            grades.add(73);
            grades.add(67);
            grades.add(38);
            grades.add(33);
            System.out.println(gradingStudents(grades));
        }
    }
