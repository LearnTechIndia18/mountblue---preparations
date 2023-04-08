import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            System.out.println(hasSubseq(s,"hackerrank") ? "YES" : "NO"); 
        }
    }
    
    private static boolean hasSubseq(String source, String target) {
        if (target.length() == 0) return true; 
        if (source.length() == 0) return false;
        
        int x = 0; 
        for (char c : source.toCharArray()) {
            if (c == target.charAt(x)) 
                x++;
            if (x == target.length()) 
                return true; 
        }
        return false; 
    }
}





