 class Excp7
 {
    public static void main(String [] args)
    {
       System.out.println("Program starts...");
       try
       {
         int x = Integer.parseInt(args[0]);
         int y = Integer.parseInt(args[1]);
         test(x,y); 
       }catch(ArrayIndexOutOfBoundsException excp)
       {
         System.out.println("Error : Less values provided");
       }
       catch(NumberFormatException excp)
       {
         System.out.println("Error : Invalid number ");
       }
       catch(ArithmeticException excp)
       {
         System.out.println("Error : Divisor is zero ");
       }

       System.out.println("Program ends...");
    }
   
   static void test(int a,int b) throws ArithmeticException
   {
        int c=0;
        try
        {
            c=a/b;
        }
        finally
        { 
          System.out.println("Division is "+c);    
       }
   }
 }