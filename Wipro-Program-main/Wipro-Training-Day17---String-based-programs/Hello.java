import java.util.Scanner;
public class Hello
{
    public static void main(String args[]){//Raja
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char c[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<s.length();j++)
        {
            if(c[i]==c[j]){
            System.out.println(c[i]);
            break;
            }
        }
    }
}

}