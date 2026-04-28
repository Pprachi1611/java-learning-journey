import java.util.*;
public class table_no {
    public static void main(String args[])
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        no=sc.nextInt();
        System.out.println("Table of "+no+" is :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(no+"*"+i+"="+no*i);
        
        }
        sc.close();
    }
}
