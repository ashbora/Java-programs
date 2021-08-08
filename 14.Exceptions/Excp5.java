import java.util.Scanner;
class Excp5
{
  public static void main(String [] args)
  {
    System.out.println("Program starts..."); 
    Scanner sc = new Scanner(System.in); 
    try
    {  
      System.out.println("Please enter a PIN :");
      int pin = sc.nextInt(); 
      if(pin!=1234)
      {
        throw new SecurityException("Invalid User");
         
      }
      System.out.println("Your are Welcome");

    }catch(Exception e)
    {
      System.out.println("Error : "+e);
    }
    System.out.println("Program ends..."); 
  }
}