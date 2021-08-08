/*
n=5
-----
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
import java.util.Scanner;
class Nested6
{     
  public static void main(String [] args)
  {
     Scanner kbin = new Scanner(System.in);
     System.out.print("Enter the value of n:");
     int n = kbin.nextInt(); 
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n-i;j++)
            System.out.print("  ");

         for(int j=1;j<i;j++)
           System.out.print(j%10 +" ");

         for(int j=i;j>=1;j--)
           System.out.print(j%10 +" ");

         System.out.println();
     } 
  }
}