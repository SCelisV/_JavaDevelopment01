package com.others;

public class Recursion {

  public static int sum(int k) {
    if (k > 0) {
                // llamo a la función nuevamente con 9,8,7,6,5,4,3,2,1
      System.out.println(k);
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

  public static int sum2(int start, int end) {
    if (end > start) {
                // llamo a la función nuevamente con 9,8,7,6
      System.out.println(end);
      return end + sum2(start, end - 1);
    } else {
      return end;
    }
  }

  public static void main(String[] args) {

      int result = sum(10);
      System.out.println(result);         // 55

      int result2 = sum2(5, 10);
      System.out.println(result2);        // 45
    
  }

}