/*Q1 — Create a class Rectangle
+Attributes:
1.length
2.breadth

+Methods:
1.area()
2.perimeter() */

import java.util.*;
    class rectangle
    {
        //int len,br;
        void area(int l, int b)
        {
            int a=l*b;
            System.out.println("Area of reactangle is:"+a);
        }
        void perimeter(int l, int b)
        {
            int p;
            p=2*l*b;
            System.out.println("Perimeter of rectangle is :"+p);
        }
    }
public class class1 {

    public static void main(String args[])
    {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        l=sc.nextInt();
        System.out.println("Enter the breadth");
        b=sc.nextInt();        
        rectangle r=new rectangle();
        r.area(l,b);
        r.perimeter(l,b);
        sc.close();
    }
}
//this for reactangle class as a inner class enclosed inside the another calss
/*import java.util.*;
public class class1 {

    class rectangle {
        void area(int l, int b) {
            int a = l * b;
            System.out.println("Area of rectangle is: " + a);
        }
    }

    public static void main(String args[]) {

        int l, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        l = sc.nextInt();

        System.out.println("Enter the breadth:");
        b = sc.nextInt();

        class1 obj = new class1();     // Create outer class object
        rectangle r = obj.new rectangle();  // Create inner class object

        r.area(l, b);
    }
} */
