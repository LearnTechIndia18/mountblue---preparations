import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        char[] s1 = sc.next().toCharArray();
        char[] s2 = sc.next().toCharArray();
        int[] chs = new int[1000];
        for(int i = 0; i < s1.length; i++){
          chs[s1[i]]++;
        }
        String result = "NO";
        for(int i = 0; i < s2.length; i++){
          if(chs[s2[i]]>0){
            result = "YES";
            break;
          }
        }
        System.out.println(result);
      }
    }
}



