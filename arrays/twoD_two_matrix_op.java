/*Problem Statement:
Write a Java program to perform the following matrix operations using methods:

✔ Input two matrices from user
✔ Print both matrices
✔ Addition of matrices
✔ Subtraction of matrices
✔ Multiplication of matrices
✔ Transpose of both matrices */

import java.util.*;
public class twoD_two_matrix_op {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int tra[][]=new int[3][3];
        int trb[][]=new int[3][3];

         System.out.println("Enter the first  matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the  second matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }  
        
        
        System.out.println("--------------------------------------------------");
        System.out.println(" First Matrix elements are:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Second Matrix elements are:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }



        System.out.println("--------------------------------------------------");
        System.out.println("MATRIX ADDITION !!");
       int sum[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               sum[i][j]=a[i][j]+b[i][j];
               System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    

        System.out.println("--------------------------------------------------");
        System.out.println("MATRIX SUBSTRACTION!!!");
        int sub[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               sub[i][j]=a[i][j]-b[i][j];
               System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("--------------------------------------------------");
        System.out.println("TRANSPOSE OF FIRST MATRIX!!!");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tra[j][i]=a[i][j];
            }
        }       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(tra[i][j]+" ");
            }
            System.out.println();
        }        
        
        System.out.println("--------------------------------------------------");
        System.out.println("TRANSPOSE OF SECOND MATRIX!!!");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                trb[j][i]=b[i][j];
            }
        }       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(trb[i][j]+" ");
            }
            System.out.println();
        }   


        System.out.println("--------------------------------------------------");




        sc.close();
    }
    
}
