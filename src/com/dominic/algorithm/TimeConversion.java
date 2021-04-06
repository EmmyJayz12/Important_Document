package com.dominic.algorithm;

import java.text.DecimalFormat;

public class TimeConversion {
  public String conversion(String s){
      DecimalFormat df = new DecimalFormat("00");
      String hh = ""; String mm=""; String ss=""; String zone=""; String result ="";
      hh = hh + s.charAt(0) +s.charAt(1);
      mm= mm + s.charAt(3)+s.charAt(4);
      ss= ss + s.charAt(6)+s.charAt(7);
      zone = zone + s.charAt(8)+ s.charAt(9);
      int hr = Integer.parseInt(hh);
      int min = Integer.parseInt(mm);
      int sec = Integer.parseInt(ss);
      if(hr == 12 && zone.equals("AM") && min <=60 && sec<=60) {
              result = "00" + ":" + df.format(min) + ":" + df.format(sec);
      }
      else if(hr <12 && zone.equals("AM") && min <=60 && sec<=60) {
          result = df.format(hr) + ":" + df.format(min) + ":" + df.format(sec);
      }
      else if(hr == 12 && zone.equals("PM") && min <=60 && sec<=60 ){
          result = df.format(hr) + ":" + df.format(min) + ":" + df.format(sec);
      }
      else if(hr <12 && zone.equals("PM") && min <=60 && sec<=60){
          hr = 12 + hr;
          result = df.format(hr) + ":" + df.format(min) + ":" + df.format(sec);
      }
      else {
          result = "Invalid Input";
      }
      return result;
  }
    public static void main (String[]args){
      TimeConversion tc = new TimeConversion();
      System.out.println(tc.conversion("06:40:03AM"));
    }
}
