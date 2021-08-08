/*
break  statement
-----------------
loop
{
   ----
   ----
   ----
   if(--)
     break;
   ----
   ----
}

*/

class BreakDemo1
{
  public static void main(String [] args)
  {
     for(int i=1;i<=10;i++)
     {
       for(int j=1;j<=10;j++)
       {
         System.out.print(j+" ");
         if(i==j)
           break;
        }
      System.out.println();
     }  
  }
}