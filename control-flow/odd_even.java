//Input a number and print whether it's even or odd.
import java.util.*;

public class odd_even {
    public static void main(String args[])
    {
        int no;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        no=sc.nextInt();
        if(no%2==0)
        {
            System.out.println("Number is even!!!");
        }
        else{
            System.out.println("Number is odd!!!");
        }
        sc.close();
    }
}
