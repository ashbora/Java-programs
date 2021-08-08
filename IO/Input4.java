import java.io.*;
class Input4
{
  public static void main(String [] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter first number :");
      int a = Integer.parseInt(br.readLine());
      System.out.print("Enter second number :");
      int b = Integer.parseInt(br.readLine());
      int c = a+b;
      System.out.println("The sum of "+a+" and "+b+" is "+c);
      System.out.printf("The sum of %d and %d is %d",a,b,c);
  }
}