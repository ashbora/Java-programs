class Excp1
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
    }catch(Exception e)
    {
     ` System.out.println("Error in data.");
    }
    System.out.println("Program ends..."); 
  }
}