import java.util.*;
public class fact_method {
    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter number:");
        n=sc.nextInt();
        int res=fact(n);
        System.out.println("Factorial of "+n+" is :"+res);
        sc.close();
    }
}
