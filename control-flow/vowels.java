import java.util.*;
public class vowels {

     static void vowel(String s)
        {
         int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'|ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U')
            {
                System.out.println(ch+" is a vowel");
            }
            else
            {
                System.out.println(ch+" is not vowel ");
            }
        }
        }
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        s=sc.nextLine();
        vowel(s);
        sc.close();
    }
}
