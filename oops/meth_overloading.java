/*Methods:
add(int a, int b)
add(double a, double b)
add(int a, int b, int c) */

//import java.util.*;
public class meth_overloading {
    static void add(int a,int b)
{
    int c=a+b;
    System.out.println("Addition of integer: "+c);
}
static void add(double a,double b)
{
    double c=a+b;
    System.out.println("addition od double: "+c);
}
static void add(int a,int b,int c)
{
    int d=a+b+c;
    System.out.println("Addition of 3 integer: "+d);
}
    public static void main(String args[])
    {
        add(10,20);
        add(9.0,0.1);
        add(10,20,30);
    }
    
}
