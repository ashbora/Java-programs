/*
   StringBuffer deleteCharAt(int loc)
*/
 class StringBufferTest8
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Testing the methods");          
      System.out.println(s);
      s.deleteCharAt(14);
      System.out.println(s);
   }
 } 