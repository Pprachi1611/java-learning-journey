import java.util.*;
public class greatest_of_3_method
{

    static void largest(int a,int b, int c)
    {
        if(a>b && a>c)
        {
           System.out.println(a+" is greatest");
        }

        else if(b>a && b>c)
        {
            System.out.println(b+" is greates");
        }
        else
        {
            System.out.println(c+ " is greatest");
        }
    }
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Enter third number:");
        c=sc.nextInt();
        largest(a,b,c);
        sc.close();
    }
}