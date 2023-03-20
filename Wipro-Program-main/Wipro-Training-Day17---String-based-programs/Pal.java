import java.util.Scanner;
public class Pal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        display(a);
    }
    public static int display(int num)
    {
    
    int rev=0,rem=0;
    while(num!=0)
    {
        rem=num%10;
        rev=rev*10+rem;
        num/=10;

    }
    if(num==rev)
      System.out.println("Pal");
    else
    System.out.println("no");
    return 0;
}
}