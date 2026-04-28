/*Q3 — Count even & odd numbers
Q4 — Find maximum & minimum value
Q5 — Search an element inside matrix */

import java.util.*;
public class matrix_op_even_find_min {
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        int ec=0,oc=0,key,min,max;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Count even & odd numbers");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]%2==0)
                {
                    ec++;
                }
                else
                {
                    oc++;
                }
            }
        }
        System.out.println("EVEN COUNT:"+ec);
        System.out.println("ODD COUNT:"+oc);


        System.out.println("-------------------------------------------------");
        System.out.println("Find maximum & minimum value");
        max=arr[0][0];
        min=arr[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println("MINIMUM :"+min);
        System.out.println("MAXIMUM:"+max);


        System.out.println("-------------------------------------------------");
        System.out.println("Search an element inside matrix ");
        System.out.println("Enter element to be searched:");
        key=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                if(key==arr[i][j])
                {
                    flag=true;
                    break;
                }
            
            }
            if(flag==true){break;}
        }
        if(flag==true)
        {
            System.out.println("ELement found!!!");
        }
        else
        {
            System.out.println("ELement  not found!!!");
        }

        sc.close();

    }

}
