/*Problem 2 — Merge Two ArrayLists

Take two lists and merge them into a single list without duplicates. */
import java.util.*;
public class merge_arraylist {
    public static void main(String args[])
    {
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first Arraylist elelments:");
    for(int i=0;i<5;i++ )
    {
        l1.add(sc.nextInt());
    }
    System.out.println("*********************************");
    System.out.println("Enter second Arraylist elelments:");
    for(int i=0;i<5;i++ )
    {
        l2.add(sc.nextInt());
    }
    for(int i=0;i<5;i++)
    {
        if(l1.contains(l2.get(i)))
        {
            continue;
        }
        else{
            l1.add(l2.get(i));
        }
         /*if(l1.get(i)!=l2.get(i))
         {
            l1.add(l2.get(i));;
         }
         else
         {
            continue;
         } this only check same index so wrong */
    }
    System.out.println("Merged ArrayList without duplicate :"+l1);
   

    sc.close();
    }
}
