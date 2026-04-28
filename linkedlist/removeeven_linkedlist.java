/*Problem 1

Add 10 numbers to LinkedList and remove all even numbers. */
import java.util.*;
public class removeeven_linkedlist {
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++)
        {
            l.add((sc.nextInt()));
        }
        System.out.println("linkedlist before even number deletion:");
        System.out.println(l);

        for(int i=0;i<10;i++)
        {
            /*using get(i) causes error beczause after every delertion index shifts by 1 so it is not efficient
            so instead we can use iterator or loop backward  or even simple method removeIf()
            Collections.removeIf(condition) => is a maethod uses to remove element based on condtion  
             where condition is lambda function
             Java internally uses Iterator, so removal is safe and does not cause index shifting.*/
            
             /*if(l.get(i)%2==0)
            {
                l.remove(i); 
            }*/

            l.removeIf(n -> n % 2 == 0);
        }
        System.out.println("linkedlist after even number deletion:");
        System.out.println(l);
        sc.close();
    }
    
}
