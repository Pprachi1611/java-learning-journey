import java.util.*;
public class fact {
    public static void main(String args[])
    {
        int fact=1,no;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+no+" is "+fact);
        sc.close();
    }
}
