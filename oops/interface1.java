/*Student Marks System
Create an interface Marks with methods:
void calculatePercentage()
void displayResult()

Create a class Student with:
Name
3 subject marks
Implement the interface to:
Calculate percentage
Print pass/fail (pass if percentage ≥ 40) */
import java.util.*;
interface  Marks
{
     void calculatePercentage();
     void displayResult();
}
class student implements  Marks
{
    Scanner sc=new Scanner(System.in);
    String name;
    int m1,m2,m3,total;
    double per;
    void getdetails()
    {
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter marks1:");
        m1=sc.nextInt();
        System.out.println("Enter marks2:");
        m2=sc.nextInt();
        System.out.println("Enter marks3:");
        m3=sc.nextInt();   
        System.out.println("*****************************");    
    }
   public  void calculatePercentage()
    {
        total=m1+m2+m3;
        per=(total/300.0)*100;
    }
    public  void displayResult()
    {
        if(per>=40)
        {
            System.out.println(per+"%");
            System.out.println("PASS");
        }
        else
        {
            System.out.println(per+"%");
            System.out.println("FAIL");
        }
    }

}
public class interface1 {
    public static void main(String args[])
    {
        student s=new student();
        s.getdetails();
        s.calculatePercentage();
        s.displayResult();
    }
}
