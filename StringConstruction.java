import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            HashSet<Character> hs=new HashSet<Character>();
            int count=0;
            for(int i=0;i<s.length();i++){
                if(!hs.contains(s.charAt(i))){
                    hs.add(s.charAt(i));
                    count++;
                }
            }
            System.out.println(count);
        }
       
        
    }
}





