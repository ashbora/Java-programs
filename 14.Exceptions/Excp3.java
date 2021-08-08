class Excp3
{
  public static void main(String [] args)
  {
    System.out.println("Program starts..."); 
    try
    {  
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int d = num1/num2;
      System.out.println("Division is "+d);
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
    System.out.println("Program ends..."); 
  }
}