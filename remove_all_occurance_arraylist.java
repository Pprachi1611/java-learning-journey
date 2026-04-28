/*Problem 4 — Remove All Occurrences

Remove all occurrences of a given element from ArrayList. */
import java.util.*;
public class remove_all_occurance_arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer>l1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int re;
        System.out.println("Enter arraylist elelments:");
        for(int i=0;i<5;i++)
        {
            l1.add(sc.nextInt());
        }
        System.out.println("Enter element to be removed");
        re=sc.nextInt();
        if(l1.contains(re))
        {
            //use removeAll(Collections.singleton(re));
            /*because removeAll requires a collection not a single value int 
            in this we provided it a single int value which is not acceptable*/
           //System.out.println(Collections.singleton(re));
            l1.removeAll(Collections.singleton(re));
        }
        System.out.println("arraylist after all occurances are removed:");
        System.out.println(l1);
        sc.close();
    }
    
}
