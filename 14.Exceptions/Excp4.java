class Excp4
{
  public static void main(String [] args)
  {
    System.out.println("Program starts..."); 
    int d=0;
    try
    {  
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      d = num1/num2;
    }catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error : Less values provided than required");
    }
    catch(NumberFormatException e)
    {
      System.out.println("Error : Given value can not converted to number");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Error : Divisor should not be zero");
    }
    finally
    {
      System.out.println("Division is "+d);
    }
    System.out.println("Program ends..."); 
  }
}