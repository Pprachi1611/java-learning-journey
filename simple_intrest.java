import java.util.*;
public  class  simple_intrest
{
    public static void main(String args[])
    {
        int p,si,r,t,total_repay;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal");
        p=sc.nextInt();
        System.out.println("Enter the rate");
        r=sc.nextInt();
        System.out.println("Enter the time in year");
        t=sc.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple Intrest is :"+si);
        total_repay=p+si;
        System.out.println("The total amount to ne repaid is :"+total_repay);
        sc.close();
    }
}