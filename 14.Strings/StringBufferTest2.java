/*
  void setLength(int len)
*/
 class StringBufferTest2
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Elegant IT");          
      System.out.println("String :"+s+"\tLength   :"+s.length());
      s.setLength(15);
      System.out.println("String :"+s+"\tLength   :"+s.length());
      s.setLength(7);
      System.out.println("String :"+s+"\tLength   :"+s.length());
   }
 } 