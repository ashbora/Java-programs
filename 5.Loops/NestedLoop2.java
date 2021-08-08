  /* 
     example of nested loop
  */

  class NestedLoop2
  {
    public static void main(String [] args)
    {
      int i=1;
      while(i<=10) 
      {
       System.out.print("Nitin ");
       int j=1;
       do
       {
          System.out.print("Wankar ");
          j++;
       } while(j<=5);
       System.out.println(); 
       i++;
      }
    }
  }