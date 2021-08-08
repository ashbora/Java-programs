import java.io.*;
class Input2
{
  public static void main(String [] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter a string:");
      String s = br.readLine();
      System.out.println("You entered :"+s);
  }
}