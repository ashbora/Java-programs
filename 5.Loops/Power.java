  /* program to find the power of a raised to b
  */

  class Power
  {
    public static void main(String [] args)
    {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int p = 1; 
       for(int i=1;i<=b;i++)
          p = p*a;

       System.out.print("The power of "+a+" raised to "+b+" is "+p);
    }
  }