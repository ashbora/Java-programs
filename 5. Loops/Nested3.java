import java.util.Scanner;
class Nested3
{
   public static void main(String [] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.print("Enter the value of n :");
       int n = kb.nextInt();
       for(int num = 1;num<=n;num++)
       {
         boolean isprime=true;
         for(int d=2;d<=Math.sqrt(num);d++)
         {
           if(num%d==0)
           {
              isprime=false;
              break;
           }   
         }
        if(isprime)
          System.out.print(num+" ");        
      }
   }
}