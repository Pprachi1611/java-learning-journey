/*super keyword

Create Parent class with variable x=10
Create Child class with x=20 */

//import java.util.*;
class Parent
{
    int a=10;
    Parent()
    {
        System.out.println("Constructor of base class");
    }
}
class child extends Parent
{
    int a=20;
    child()
    {
        super();
        System.out.println("Constructour of child class");
    }
    void display()
    {
        System.out.println("Parent a:"+super.a);
        System.out.println("Child a:"+a);
    }
    
}
public class superkey {
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        child c=new child();
        c.display();
        
    }
}
