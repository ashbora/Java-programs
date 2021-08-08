/*
   StringBuffer delete(int startIndex,int endIndex)
*/
 class StringBufferTest7
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Testing the methods");          
      System.out.println(s);
      s.delete(8,11);
      System.out.println(s);
   }
 } 