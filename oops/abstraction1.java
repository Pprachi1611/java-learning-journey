/*Create an abstract class Shape
Methods: area() (abstract)
Classes: Circle, Rectangle overriding area(). */
import java.util.*;
abstract class shape
{
    Scanner sc=new Scanner(System.in);
    abstract void area();
}
class circle extends shape
{
    void area()
    {
        int r;
        double pi=3.14;
        
        System.out.println("Enter radius");
        r=sc.nextInt();
        double a=pi*r*r;
        System.out.println("Area of circle:"+a);
        System.out.println("****************************");
        System.out.println();
    }
}
class reactangle extends shape
{
    void area()
    {
        int l,b;
        System.out.println("Enter length:");
        l=sc.nextInt();
        System.out.println("Enter breadth:");
        b=sc.nextInt();
        int a=l*b;
        System.out.println("Area of reactangel:"+a);
    }
}
public class abstraction1 {
    public static void main(String args[])
    {
        circle c=new circle();
        c.area();
        reactangle r=new reactangle ();
        r.area();
    }
    
}
