import java.util.*;
public class list1
{
    public static void main(String args[]) 
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

          // System.out.println(l2);
            
            sc.close();
        }
    
}