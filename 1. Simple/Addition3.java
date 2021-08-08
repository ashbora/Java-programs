import java.io.*;
class Addition3
{
  public static void main(String [] args) throws IOException
  {
     DataInputStream dis = new DataInputStream(System.in);
     System.out.print("Enter first number :");
     int n1 = Integer.parseInt(dis.readLine());
     System.out.print("Enter second number :");
     int n2 = Integer.parseInt(dis.readLine());
     int sum = n1+n2;
     System.out.println("The sum of "+n1+" and "+n2+" is "+sum);
  }
}