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

class BreakDemo
{
  public static void main(String [] args)
  {
     for(int i=1;i<=10;i++)
     {
        System.out.print(i+"\t");
        if(i==5)
           break;
     }  
  }
}