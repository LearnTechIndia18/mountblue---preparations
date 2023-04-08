import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        int maxHeight = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(word.contains(ch + "") && h[ch - 'a'] > maxHeight)
                maxHeight = h[ch - 'a'];
        }
        
        System.out.println(maxHeight * word.length());
    }
}






