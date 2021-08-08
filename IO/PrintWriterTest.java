/*
 PrintWriter class
-------------------
constructor
PrintWriter(OutputStream out,boolean flushOnNewLine)

*/

import java.io.*;
class PrintWriterTest
{
  public static void main(String [] args)
  {
     PrintWriter pw = new PrintWriter(System.out,true);
     String msg = "Twinkle Twinkle little star";
     pw.println(msg);
     pw.println(1234);
     pw.println(56.78);     
  }
}
