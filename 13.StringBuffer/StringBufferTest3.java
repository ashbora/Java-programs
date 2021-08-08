/*
  void setLength(int len)
*/

class StringBufferTest3
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Practice makes man perfect.");
     System.out.println("S       :"+s);
     System.out.println("Length  :"+s.length());
     s.setLength(50);
     System.out.println("S       :"+s);
     System.out.println("Length  :"+s.length());   
     s.setLength(15);
     System.out.println("S       :"+s);
     System.out.println("Length  :"+s.length());
  }  
}