import java.util.Scanner;
class Matrix1
{
  public static void main(String [] args)
  {     
     int m[][];         //int [][]m;     matrix declaration
     m = new int[3][4];      //matrix creation

     Scanner kbin = new Scanner(System.in);
     System.out.print("Enter values for 3x4 matrix :");
     for(int i=0;i<3;i++)
       for(int j=0;j<4;j++)
          m[i][j] = kbin.nextInt();

     System.out.println("Matrix is");
     for(int i=0;i<3;i++)
     {
        for(int j=0;j<4;j++)
          System.out.print(m[i][j]+"\t");

        System.out.println(); 
     }    
  }
}