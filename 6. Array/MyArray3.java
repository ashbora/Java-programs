import java.util.Scanner;
class MyArray3
{
   public static void main(String [] args)
   {
      Scanner kbin = new Scanner(System.in);

      int [] a = new int[5];  //array declaration & creation  
      //array input
      System.out.print("Enter 5 values for the array :");
      for(int i=0;i<5;i++)
         a[i] = kbin.nextInt();

      //array output 
      System.out.println("Array values are"); 
      for(int i=0;i<5;i++)
        System.out.print(a[i]+" ");   
   }  
}
   