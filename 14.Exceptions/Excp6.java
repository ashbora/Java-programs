class Excp6
{
  public static void main(String [] args)
  {
    System.out.println("Program starts..."); 
    try
    {
      int n1 = Integer.parseInt(args[0]);
      int n2 = Integer.parseInt(args[1]);
      division(n1,n2);
    } catch(NumberFormatException e)
    { System.out.println("Error :"+e); }
 
    catch(ArrayIndexOutOfBoundsException e)
    { System.out.println("Error :"+e); }

    catch(ArithmeticException e)
    { System.out.println("Error :"+e); }
    
    System.out.println("Program ends..."); 
  }
  static void division(int a,int b) throws ArithmeticException
  {
     
     int c = a/b;
     System.out.println("Division is "+c);
     
  }
}