/* 
   program to copy the contents of one file into another 
*/
import java.io.*;
class FileCopy
{
   public static void main(String [] args)
   {
       BufferedReader br =null ;
       String sourcefilename="",destfilename=""; 
      try
      {
         br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the name of file to copy :");
         sourcefilename= br.readLine();
         System.out.print("Enter the name of destination file :");
         destfilename= br.readLine();
     }catch(IOException excp)
      { System.out.println("Error while reading data"); }
 
        FileInputStream fin ;
        try
           {
               fin = new FileInputStream(sourcefilename);
           }catch(FileNotFoundException excp)
           {
               System.out.println("Source file not found");
               return ;
           }

       FileOutputStream fout;
       try
      {   
           fout= new FileOutputStream(destfilename);
      }catch(FileNotFoundException excp)
      {
           System.out.println("Destination file can not be opened.");
           return ;
      }
      try
      {
        int ch;
        while( (ch = fin.read())!= -1 )
        { 
          fout.write(ch);
        }
       fin.close();
       fout.close();        
      }
      catch(IOException excp)
     {
         System.out.println("Error occured while reding/writing with file");
      }   
   }
}

