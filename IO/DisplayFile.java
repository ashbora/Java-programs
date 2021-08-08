import java.io.*;
class DisplayFile
{
  public static void main(String [] args)
  {
    String filename="";
    FileInputStream fin;
    try
    {
      filename = args[0];
      fin = new FileInputStream(filename); 
      int i;
      do
      {
          i = fin.read();
          System.out.print((char)i);
      }while(i!=-1);      
      fin.close();
    }catch(ArrayIndexOutOfBoundsException excp)
    { 
      System.out.println("File name not provided");
    }
    catch(FileNotFoundException excp)
    {
       System.out.println("File does not exists");
    }
    catch(IOException excp)
    {
       System.out.println("File read error"); 
    }    
  } 
}