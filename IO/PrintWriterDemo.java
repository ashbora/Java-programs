import java.io.*;
class PrintWriterDemo
{
   public static void main(String [] args)
   {
          PrintWriter pw = new PrintWriter(System.out,true);
          pw.println("Hello ! This is the demo");
          int x = 8783;
          double y = 645.566;
          pw.println(x);
          pw.println(y);
   }
}         