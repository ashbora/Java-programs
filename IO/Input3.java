import java.io.*;
class Input3
{
  public static void main(String [] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String [] txt = new String[100];      
      System.out.println("Enter textlines,'END' to exit:");
      for(int i=0;i<txt.length;i++)
      {
        txt[i] = br.readLine();
        if(txt[i].equalsIgnoreCase("END"))
              break;
      }
      for(int i=0;i<txt.length;i++)
      {
         if(txt[i].equalsIgnoreCase("END"))
              break;
         System.out.println(txt[i]);
      }
  }
}