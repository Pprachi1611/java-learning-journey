/*Problem 4

Use LinkedList as Stack for undo operation */
import java.util.*;
public class linkedlist_as_Stack {
    public static void main(String args[])
    {
        LinkedList <Integer> s=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter initial stack elelments:");
        for(int i=0;i<5;i++)
        {
            s.push(sc.nextInt());
        }
        while(true)
        {
            System.out.println("\n1. Do Action");
            System.out.println("2. Undo Last Action");
            System.out.println("3. View Stack");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            ch=sc.nextInt();
            if(ch==0)
            {
                System.out.println("thank you!!");
                break;
            }
            switch(ch)
            {
                case 1: System.out.println("enter number::");
                        int a=sc.nextInt();
                        s.push(a);
                        System.out.println("Action performed!!");
                        //System.out.println("Stack :"+s);
                        break;
                case 2: if(s.isEmpty())
                        {
                            System.out.println("Stack is empty!!!");
                        }
                        else
                        {
                        System.out.println("Element removed:"+s.pop());
                        }
                        break;
                case 3: System.out.println("current stack:"+s);
                        break;
                default: System.out.println("invalid choice!!!");
            }
        }
        sc.close();
      
    }
    
}
