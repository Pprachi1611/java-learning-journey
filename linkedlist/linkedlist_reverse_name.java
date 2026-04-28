/*Problem 2

Store names in LinkedList and display in reverse order. */
import java.util.*;
public class linkedlist_reverse_name
{
    public static void main(String args[])
    {
        LinkedList <String> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 names:");
        for(int i=0;i<5;i++)
        {
            l.add(sc.next());
        }
        System.out.println("List before reverse: "+l);
        for(int i=l.size()-1;i>=0;i--)
        {
            System.out.println(l.get(i));
        }
         

        sc.close();
    }
}