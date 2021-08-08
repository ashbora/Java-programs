import java.io.*;
class FileWrite
{
  public static void main(String [] args) throws IOException,FileNotFoundException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String filename;
      System.out.print("Enter the name of file to create :");
      filename = br.readLine();
      String [] text = new String[100]; 
      System.out.println("Enter lines of text, 'STOP' to quit ");
      int i=0; 
      String str;
      do
      {
       str = br.readLine(); 
       if(!str.equalsIgnoreCase("STOP"))
       {
         text[i] = str;
         i++;
       }
      }while(!str.equalsIgnoreCase("STOP"));
 
      FileOutputStream fout = new FileOutputStream(filename);
      for(int j=0;j<i;j++)
      {
        for(int k=0;k<text[j].length();k++)
          fout.write(text[j].charAt(k));
         fout.write('\n');
      }

      fout.close();
  }
}