import java.util.*;
public class matrix_transpose {
    public static void main(String args[])
    {
    int arr[][]=new int[2][2];
    int trans[][]=new int[2][2];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter elements");
    for(int i=0;i<2;i++)
     {
          for(int j=0;j<2;j++)
           {
              arr[i][j]=sc.nextInt();
           }
     }

     System.out.println("Actaul Matrix is:");
     for(int i=0;i<2;i++)
     {
        for(int j=0;j<2;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
     }


     for(int i=0;i<2;i++)
     {
        for(int j=0;j<2;j++)
        {
            trans[j][i]=arr[i][j];
        }
     }

     System.out.println("TRANSPOSE OF MATRIX IS :");
     for(int i=0;i<2;i++)
     {
        for(int j=0;j<2;j++)
        {
            System.out.print(trans[i][j]+" ");
        }
        System.out.println();
     }
     sc.close();


    }

    
}
