/*Problem 3 — Even Number Filter

Given an ArrayList<Integer>, create a new ArrayList containing only even numbers. */
import java.util.*;
public class arraylist_even_filter {
    public static void main(String args[])
    {
        ArrayList <Integer> l1=new ArrayList<>();
        ArrayList <Integer> even=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arraylist elelments:");
        for(int i=0;i<5;i++)
        {
            l1.add(sc.nextInt());
        }
        System.out.println("Even number from arraylist are :");
        for(int i=0;i<5;i++)
        {
            if(l1.get(i)%2==0)
            {
                even.add(l1.get(i));
            }
        }
        System.out.println(even);

        sc.close();
    }
    
}
