import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TChallenges {

    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
           int v = in.nextInt();
           int n = in.nextInt();
        
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt();
           }  
        
           int i=0;
           while (ar[i]<v){
                i++;
           }
           System.out.println(i);
        
    }
}








