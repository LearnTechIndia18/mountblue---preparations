import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String stringsXOR(String s, String t) {
  String ans = "";
           // Loop to iterate over the
        // Binary Strings
        for (int i = 0; i < s.length(); i++)
        {
            // If the Character matches
            if (s.charAt(i) == t.charAt(i))
                ans += "0";
            else
                ans += "1";
        }
        return ans;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

}



