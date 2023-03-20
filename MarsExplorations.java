import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExplorations
{

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int pos = 0;
        int numAltered = 0;
        while(pos < S.length()){
            if(S.charAt(pos) != 'S') numAltered++;
            if(S.charAt(pos+1) != 'O') numAltered++;
            if(S.charAt(pos+2) != 'S') numAltered++;
            pos+=3;
        }
        System.out.println(numAltered);
    }
}