//Create a switch-based calculator (add, sub, mul, div).
import java.util.*;

public class calci_switch {
    public static void main(String args[])
    {
        int a,b,ch;
        double c;
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Mod\n6.Power");
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        System.out.println("Enter the choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: c=a+b;
                    System.out.println("Addition: "+c);
                    break;
            case 2: c=a-b;
                    System.out.println("Sub: "+c);
                    break;
            case 3: c=a*b;
                    System.out.println("Mul: "+c);
                    break;       
            case 4: if(b!=0)
                    {
                     c=a/b;
                    System.out.println("Div: "+c);
                    }
                    else
                    {
                        System.out.println("Divide by zero not possible");
                    }
                    break; 
            case 5: if(b!=0)
                    {
                     c=a%b;
                    System.out.println("Mod: "+c);
                    }
                    else
                    {
                        System.out.println("Divide by zero not possible");
                    }
            case 6: c=(double)Math.pow(a,b);
                    System.out.println("Power: "+c);
                    break;  
            default:System.out.println("Enter valid choice!!!");   
        }

        sc.close();
    }
}
