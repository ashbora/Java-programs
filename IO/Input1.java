import java.io.*;
class Input1
{
  public static void main(String [] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter a character :");
      char ch = (char)br.read();
      System.out.println("You entered :"+ch);
  }
}