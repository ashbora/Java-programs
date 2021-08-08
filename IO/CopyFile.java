import java.io.*;
class CopyFile
{
  public static void main(String [] args)
  {
    FileInputStream fin;
    FileOutputStream fout;
    try
    {
      fin = new FileInputStream(args[0]); 
      fout = new FileOutputStream(args[1]);
      int i;
      while(true)
      {
          i = fin.read();
          if(i==-1)
             break; 
          fout.write(i);
      }
      fin.close();
      fout.close(); 
   }catch(ArrayIndexOutOfBoundsException excp)
    { 
      System.out.println("File name not provided");
    }
    catch(FileNotFoundException excp)
    {
       System.out.println("File can not be open");
    }
    catch(IOException excp)
    {
       System.out.println("File read error"); 
    }    
  } 
}