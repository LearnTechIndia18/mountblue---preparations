import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=Integer.toCharArray(a);
        int r;
        for(int i=0;i<ab.length;i++)
        {
          r=a%10;
          b[i]=r;
          b=b/10;  
        }
        System.out.print(b);
    }
}