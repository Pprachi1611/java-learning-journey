/*Problem Statement
Write a Java program using Class + Objects + Methods + Constructor to perform:
Add student details (name, roll, marks)
Display student details
Calculate total marks
Calculate percentage
    Grade student based on percentage
    ≥ 90 : A
    ≥ 80 : B
    ≥ 70 : C
    ≥ 60 : D
    else : FAIL
Bonus (If you want to challenge yourself):
Take multiple students using array of objects
Display topper */

import java.util.*;
class student
{
    String name,dept;
    int roll,total,whole=500;
    int m1,m2,m3,m4,m5;
    double avg,per;
    Scanner sc=new Scanner(System.in);

    student(String name, int roll,String dept)
    {
        this.name=name;
        this.roll=roll;
        this.dept=dept;
    }
    void input()
    {
        System.out.println("Enter marks1:");
        m1=sc.nextInt();
        System.out.println("Enter marks2:");
        m2=sc.nextInt();
        System.out.println("Enter marks3:");
        m3=sc.nextInt();
        System.out.println("Enter marks4:");
        m4=sc.nextInt();
        System.out.println("Enter marks5:");
        m5=sc.nextInt();
    }
    void display()
    {
        System.out.println("**************STUDENTS DETAIL*******************");
        System.out.println("NAME    :"+this.name);
        System.out.println("Roll NO.    :"+this.roll);
        System.out.println("DEPT    :"+this.dept);
        System.out.println("TOTAL    :"+this.total);
        System.out.println("PERCENTAGE    :"+this.per);
        grade();
    }
    void  percent()
    {
        total=m1+m2+m3+m4+m5;
        //avg=total/5;
        //System.out.println("Avg of "+this.name+" is : "+avg);
        per=(total/500.0)*100;
        }
    void grade()
    {
        if(per>=90)
        {
            System.out.println(" Grade A");
        }
        else if(per>=80)
        {
            System.out.println("Grade B");
        }
        else if(per>=70)
        {
            System.out.println("Grade c");
        }
        else if(per>=60)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }


}
public class class_obj_con_meth 
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        student []s= new student[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter name , roll no and dept for  "+(i+1)+" student");
            String name=sc.next();
            int roll=sc.nextInt();
            String dept=sc.next();
            s[i]= new student(name,roll,dept);
            s[i].input();
            s[i].percent();
        }
        for (int i = 0; i < 5; i++) 
        {
            s[i].display();
        }

        double max=s[0].per;
        int topperid=0;

        for( int i=0;i<5;i++)
        {
            if(s[i].per>max)
            {
                max=s[i].per;
                topperid=i;
            }
        }
        System.out.println("********TOPPER OF CLASS ********");
        s[topperid].display();

        sc.close();
    }
}
