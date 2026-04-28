import java.util.*;

public class hospital_que_linkedlist {
    public static void main(String args[])
    {
        Queue<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter patient numbers in sequence:");
        for(int i=0; i<5; i++)
        {
            l.add(sc.nextInt());  
        }

        System.out.println("Current Queue: " + l);

        l.add(201);
        l.add(380);

        System.out.println("Queue after update: " + l);

        System.out.println("First patient: " + l.peek()); 

        l.poll();  
        l.poll();  

        System.out.println("Queue after removal: " + l);

        sc.close();
    }
}
