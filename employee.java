import java.util.*;
class emp 
{
    private  double sal;
    private String name;
    public void setter(String n,double s)
    {
        this.name=n;
        this.sal=s;
    }

    public String getname()
    {
        return this.name;
    }

    public double getsal()
    {
        return this.sal;
    }
}
   
public class employee {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        emp e=new emp();
        System.out.println("Enter name:");
        String str=sc.next();
        System.out.println("Enter salary: ");
        double s=sc.nextDouble();
        e.setter(str,s);
        System.out.println("EMPLOYEE DETAILS:");
        System.out.println("Name :"+e.getname());
        System.out.println("Salary :"+e.getsal());
        sc.close();
    }
}
