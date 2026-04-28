import java.util.*;
public class matrix_addition {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("MAtrix addition:");
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println("sum :"+sum);


        System.out.println("ROW WISE ADDITION!!!!");
     
        for(int i=0;i<3;i++)
        {
            int sum1=0;

            for(int j=0;j<3;j++)
            {
                sum1+=arr[i][j];
            }

            System.out.println("Row " + (i+1) +" = " + sum1);
        }

        System.out.println("COLUMN WISE ADDITION!!!!");
        for(int j=0;j<3;j++)
        {
            int sum3=0;
            for( int i=0;i<3;i++)
            {
                sum3+=arr[i][j];
            }
            System.out.println("Column " + (j+1) +" = " + sum3);
        }


        sc.close();
        
    }
}
