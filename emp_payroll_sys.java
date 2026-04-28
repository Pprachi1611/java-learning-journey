/*
Employee Payroll System using Inheritance
✔ Parent class: Employee
Attributes:
name
id
baseSalary
Methods:
showDetails()

✔ Child class: FullTimeEmployee
Attributes:
bonus
Method:
calculateSalary() → baseSalary + bonus

✔ Child class: PartTimeEmployee
Attributes:
hoursWorked
ratePerHour
Method:
calculateSalary() → hoursWorked * ratePerHour

MENU:
1 → Add Full-Time Employee
2 → Add Part-Time Employee
3 → Display Salary
0 → Exit */
import java.util.*;
class Employee
{
    String name;
    int id;
    double sal;
    void showdetails()
    {
        System.out.println("************EMPLOYEE DETAILS****************");
        System.out.println("NAME:"+name);
        System.out.println("ID:"+id);
        System.out.println(" SALARY :"+sal);
    }
}
class FullTimeEmployee extends Employee
{
    double bonus,totalsal;
    void calculateSalary()
    {
        totalsal=sal+bonus;
        System.out.println("Totla salary of full time Employee is: "+totalsal);
    }
}
class PartTimeEmployee extends Employee
{
    int hoursworked;
    double rateperhour,totalsal;
    void calculateSalary()
    {

        totalsal=hoursworked*rateperhour;
        System.out.println("Total salary of parttime employee is :"+totalsal);
    }

}
public class emp_payroll_sys {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch,id,hoursworked;
        double sal,bonus,rateperhourate;
        String name;
        PartTimeEmployee pe=null;
        FullTimeEmployee fe=null;
        while(true)
        {
        System.out.println("1.Add Full-Time Employee");
        System.out.println("2.Add Part-Time Employee");
        System.out.println("3.Display Salary");
        System.out.println("0.Exit");
        System.out.println("Enter choice:");
        ch=sc.nextInt();
        if(ch==0)
        {
            System.out.println("Thank you");
            break;
        }
        if(ch>=4||ch<0)
        {
            System.out.println("Invalid choice");
        }
        switch(ch)
        {
            case 1: fe=new FullTimeEmployee();
                    System.out.println("Enter full time emp name");
                    fe.name=sc.next();
                    System.out.println("Enter full time emp id");
                    fe.id=sc.nextInt();
                    System.out.println("Enter full time emp sal");
                    fe.sal=sc.nextDouble();
                    System.out.println("Enter full time emp bonus");
                    fe.bonus=sc.nextDouble();
                    System.out.println("Full time employee added successfully");
                    break;

            case 2: pe=new PartTimeEmployee();
                    System.out.println("Enter part time emp name");
                    pe.name=sc.next();
                    System.out.println("Enter part time emp id");
                    pe.id=sc.nextInt();
                    System.out.println("Enter part time hours worked");
                    pe.hoursworked=sc.nextInt();
                    System.out.println("Enter the rate:");
                    pe.rateperhour=sc.nextDouble();
                    break;
            case 3: if(pe!=null)
                    {
                        pe.showdetails();
                        pe.calculateSalary();
                    }

                    if(fe!=null)
                    {
                        fe.showdetails();
                        fe.calculateSalary();
                    }
                    if(pe==null && fe==null)
                    {
                     
                        System.out.println("No recorded added yet");
                    }
                    break;
            default:System.out.println("Invalid choice!!!"); 
        }

        }

        sc.close();
    
}
}
