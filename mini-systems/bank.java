/*Q1.Create a class BankAccount using the concept of Encapsulation.
Use private fields:
accountNumber
balance
pin
Initialize each account with an account number and PIN.

Implement public methods:
deposit()
withdraw()
getBalance()
Each transaction must verify the PIN.
In main(), create 3 bank accounts using an array.
Display a menu to perform: Deposit, Withdraw, Exit.
Allow the user to select an account and perform operations repeatedly. */

import java.util.*;
class BankAccount
{
 private int accno,bal;
  Scanner sc=new Scanner(System.in);

  private int pin;
    BankAccount(int acc)
    {
        this.accno=acc;
        this.bal=0;
        System.out.println("Set Account Password (PIN):");
        pin=sc.nextInt();
        System.out.println("***************************************");
    }


    boolean verifypin(int security)
    {
        return pin==security;
    }
   

    public void deposit()
    {
        int sp;
        System.out.println("enter security pin:");
        sp=sc.nextInt();
       if(verifypin(sp))
       {
        System.out.println("Enter amount to deposit");
        int dep=sc.nextInt();
        bal=bal+dep;
        System.out.println("Amount deposited!!!");
        getbalance();
        System.out.println("***************************************");
       }
       else
       {
        System.out.println("Invalid pin!!");
        System.out.println("***************************************");
       }
       
    }

    
    public void withdraw()
    {
        int sp;
        System.out.println("enter security pin:");
        sp=sc.nextInt();
        if(verifypin(sp))
        {
        System.out.println("Enter amount to withdraw:");
        int wit=sc.nextInt();
        if(bal>wit)
        {
             bal=bal-wit;
             System.out.println("Amount withdraw successfully!!!!");
            getbalance();
            System.out.println("***************************************");
        }
        else
        {
            System.out.println("Insufficient balance!!!!!");
            System.out.println("***************************************");
        }
        }
        else
        {
            System.out.println("Invalid pin!!");
            System.out.println("***************************************");
        }
    }


    public void getbalance()
    {
        System.out.println("TOtal balance: "+bal);
    }


}
public class bank {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        BankAccount []b=new BankAccount[3];
      
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter account number for "+(i+1));
            int acc=sc.nextInt();
            b[i]=new BankAccount(acc);
        }


        while(true)
        {
        System.out.println("*********MENU*********:");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Exit");
        System.out.println("Enter choice:");
        ch=sc.nextInt();
        System.out.println("***************************************");
        if(ch==3)
        {
            System.out.println("Thank you!!!");
            break;
        }
        if(ch!=1 && ch!=2)
        {
            System.out.println("Invalid choice!!!");
        }
        System.out.println("Enter acc numbber to be opertaed:");
        int idx=sc.nextInt();
        if(idx>=3 || idx<0)
        {
            System.out.println("Invalid index!!");
            return;
        }
        switch(ch)
        {
            case 1: b[idx].deposit();
                    break;
            case 2: b[idx].withdraw();
                    break;
        }
        }
   
    }
        
}

