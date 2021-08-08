/* program to read the data from the file whose name is provided and then print that
   data on screen
*/
import java.io.*;
class FileRead
{
   public static void main(String [] args)
   {
      try
      {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the name of file to read :");
       String filename = br.readLine();
       FileInputStream fin = new FileInputStream(filename);
       int ch;
       while( (ch = fin.read()) !=-1)
           System.out.print((char)ch);
       fin.close();        
      }catch(FileNotFoundException excp)
       {
           System.out.println("Specified file does not exist");
      }
      catch(IOException excp)
     {
         System.out.println("Errro occured while reading from file");
     }   
   }
}

