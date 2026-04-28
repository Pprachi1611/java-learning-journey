/*1️⃣ Take N numbers in array → print them
2️⃣ Find maximum and minimum
3️⃣ Count even and odd elements
4️⃣ Search a number (linear search)
5️⃣ Reverse the array
6️⃣ Find sum and average
7️⃣ Count how many numbers are divisible by 3 or 5 */


import java.util.*;
public class array {
    public static void main(String aargs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,min,max,ecount=0,ocount=0,key,sum=0,avg=0;
        int tcount=0,fcount=0;
        int arr[]= new int[5];
        System.out.println("Enter the array size:");
        n=sc.nextInt();


        System.out.println("------------------------------------------");
        System.out.println("Enter the array values:");
        for(int i=0;i<5;i++)
        {
               arr[i]=sc.nextInt();
        }


        System.out.println("------------------------------------------");
        System.out.println("Array elements are:");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        System.out.println("------------------------------------------");
        System.out.println("smallest and largest element from array:");
        min=arr[0];
        max=arr[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
           
        }
        System.out.println("Smallest:"+min);
        System.out.println("Largest:"+max);


        System.out.println("------------------------------------------");
        System.out.println("Counting even odd from array!!!!");
        for(int i=0;i<5;i++)
        {
            if(arr[i]%2==0)
            {
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("Even number present in array :"+ecount);
        System.out.println("Odd number present in array :"+ocount);


        System.out.println("------------------------------------------");
        System.out.println("Enter number to be searched:");
        key=sc.nextInt();
        boolean flag=true;
        for(int i=0;i<5;i++)
        {
            if(arr[i]==key)
            {
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println("Element found!!!");
        }
        else
        {
            System.out.println("Element not found!!");
        }


        System.out.println("------------------------------------------");
        System.out.println("Reversed array is:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("------------------------------------------");
        System.out.println("Sum and Average of array elements :");
        sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=arr[i];
            avg=sum/n;
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average :"+avg);


        System.out.println("------------------------------------------");
        System.out.println("Array Elements divisible by 3 & 5");
        for(int i=0;i<5;i++)
        {
            if(arr[i]%3==0)
            {
                tcount++;
            }
            if(arr[i]%5==0)
            {
                fcount++;
            }
        }
        System.out.println("Divisible by 3:"+tcount);
        System.out.println("Divisible ny 5:"+fcount);

        sc.close();
    }
    
}
