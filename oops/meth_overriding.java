/*Parent: area()
Child:
Circle
Rectangle
Triangle
Override area() in each class. */
import java.util.*;

class shape
{
    Scanner sc=new Scanner(System.in);
    void area()
    {
        System.out.println("HEllO");
    }
}
class circle extends shape
{
    int r;
    double pi=3.14,a;
    void area()
    {
        System.out.println("enter radius:");
        r=sc.nextInt();
        a=pi*r*r;
        System.out.println("Area:"+a);
    }
}
class rectangle extends shape
{
    int l,b;
    int a;
    void area()
    {
        System.out.println("enter length:");
        l=sc.nextInt();
        System.out.println("enter breadth:");
        b=sc.nextInt();
        a=l*b;
        System.out.println("Area of reactangle:"+a);
    }

}
class triangle extends shape
{
    int ba,he;
    void area()
    {
    System.out.println("enter base:");
    ba=sc.nextInt();
    System.out.println("enter height:");
    he=sc.nextInt();
    double a=0.5*ba*he;
    System.out.println("Area of triangle: "+a);
    sc.close();
    }

}
public class meth_overriding {
    public static void main(String args[])
    {
      //  circle c=new circle();
       // rectangle r=new rectangle();
        triangle t=new triangle();
        //c.area();
        //r.area();
        t.area();
   

    }
}
