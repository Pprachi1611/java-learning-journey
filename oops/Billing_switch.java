/*Problem Statement
Create a menu-driven Billing System using switch case.
Menu:
1. Chocolate - ₹10
2. Peach - ₹60
3. Vanilla - ₹70
4. Strawberry - ₹30
5. Almond Crunch - ₹145
0. Exit
For each item:
Input choice
Input quantity
Add price * qty to total
When user enters 0 → print:
Total Bill = ₹___ */

import java.util.*;
public class Billing_switch {
    public static void main(String args[])
    {
        int  ch,q,total=0;
        int price=0;
       // int c=10,p=60,v=70,s=30,a=145;
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Chocolate - 10 ");
        System.out.println("2. Peach - 60 ");
        System.out.println("3. Vanilla - 70 ");
        System.out.println("4. Strawberry - 30");
        System.out.println("5. Almond Crunch - 145 ");
        System.out.println("0. exit ");


       
        while(true)
        {
        System.out.println("enter icecream flavour :");
        ch=sc.nextInt();
        if(ch==0)
        {
            System.out.println("Total Bill = " + total);
             break;
        }
        System.out.println("Enter quantity");
        q=sc.nextInt();
        switch(ch)
        {
            case 1: price=10; break;
            case 2: price=60;break;
            case 3: price=70;break;
            case 4: price=30;break;
            case 5: price=145;break;
            default:
                    System.out.println("Enter valid choice!!!");
                   continue;
        }
        total=price*q;
        }
        sc.close();
    }
}
