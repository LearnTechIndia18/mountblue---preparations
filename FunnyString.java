import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
        String s=sc.next();
        int len=s.length();
        int stop=(len/2);
        int flag=0;
        int i=0;
        for(i=0;i<stop;i++)
            {
            int diff_fwd=(int)(s.charAt(i))-(int)(s.charAt(i+1));
            int diff_back=(int)(s.charAt(len-1-i))-(int)(s.charAt(len-1-(i+1)));
            if(Math.abs(diff_fwd)!=Math.abs(diff_back))
                {
                    flag=1;
                    break;
                }
        }
        if(flag==1)
            System.out.println("Not Funny");
        else
            System.out.println("Funny");
    }
}
}





