/*reverse arraylist without using Collections.reverse() */
import java.util.*;
public class reverse_arraylist {
    public static void main(String argr[])
    {         
            ArrayList<Integer> l2 = new ArrayList<>();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 5 elelments:");
            for(int i=0;i<5;i++)
            {
                l2.add(sc.nextInt());
            }
            System.out.println("***************************");
            System.out.println("Elements of arraylist are:");
            for(int i=0;i<5;i++)
            {
                System.out.println(l2.get(i));
            }

            System.out.println("Elements in reverse:");
           // Collections.reverse(l2);
            //System.out.println(l2);
            for(int i=l2.size()-1;i>=0;i--)
            {
                System.out.println(l2.get(i));
            }

          
            
            sc.close();
    }
    
}

