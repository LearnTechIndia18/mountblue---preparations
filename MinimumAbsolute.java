import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumAbsolute{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int minimum=999999999;
        for(int i = 1; i  <  (a.length - 1); i++){
         int temp = Math.abs(a[i+1] - a[i]);
         if (temp  <  minimum)
            minimum = temp;
      }
        // your code goes here
        System.out.println(minimum);
    }
}
