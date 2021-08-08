class Excp7
{
  public static void main(String [] args)
  {
    System.out.println("Program starts..."); 
    try
    {
      fun();
    } 
    catch(Exception e)
    { 
      System.out.println("Error :"+e);
      System.out.println("Original reason :"+e.getCause());
    }
    System.out.println("Program ends..."); 
  }
  static void fun() throws NullPointerException
  {
     NullPointerException e = new NullPointerException();
     e.initCause(new NegativeArraySizeException());   
     throw e;
  }
}