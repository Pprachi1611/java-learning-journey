/*
add addfirst addlast
remove removefirst removelast
peek poll
push pop
 */
import java.util.*;
public class simple_linkedlist {
    public static void main(String args[])
    {
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        //adding
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List elelemnts :"+list);
        list.addFirst(50);
        list.addLast(40);
        System.out.println("List after update:"+list);

        //removing
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("List after removing:"+list);

        //linked list as queue
        list.add(20);
        list.add(40);
        list.addFirst(80);
        list.add(100);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println("List before operations"+list);
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println("List after operations"+list);

        //linked list as stack
       list.push(88);
       list.push(99);
       System.out.println("List before pop:"+list);
       System.out.println(list.pop());
       System.out.println("list after pop:"+list);
       sc.close();

    }
    
}
