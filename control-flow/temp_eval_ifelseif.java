/* 
Input temperature and print:
"Cold" if < 15
"Normal" if 15–30
"Hot" if > 30
*/

import java.util.*;
public class temp_eval_ifelseif {
    public static void main(String args[])
    {
        int temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature:");
        temp=sc.nextInt();
        if(temp<15)
        {
            System.out.println("Cold");
        }
        else if(temp>=15 & temp<=30)
        {
            System.out.println("Normal");
        }
        else if(temp>30)
        {
            System.out.println("HOT");
        }
        else
        {
            
        }
        sc.close();

    }
}
