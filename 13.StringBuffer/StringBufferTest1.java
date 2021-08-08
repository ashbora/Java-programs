/*
  StringBuffer()
  StringBuffer(int size)
  StringBuffer(String str)
  int length()
  int capacity()
*/

class StringBufferTest1
{
  public static void main(String [] args)
  {
     StringBuffer s1 = new StringBuffer();
     System.out.println("S1       :"+s1);
     System.out.println("Length   :"+s1.length());
     System.out.println("Capacity :"+s1.capacity());

     StringBuffer s2 = new StringBuffer(50);
     System.out.println("\nS2       :"+s2);
     System.out.println("Length   :"+s2.length());
     System.out.println("Capacity :"+s2.capacity());

     StringBuffer s3 = new StringBuffer("Time is money.");
     System.out.println("\nS3       :"+s3);
     System.out.println("Length   :"+s3.length());
     System.out.println("Capacity :"+s3.capacity());
  }  
}