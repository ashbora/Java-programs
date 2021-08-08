/*
   StringBuffer replace(int startIndex,int endIndex,String str)
*/
 class StringBufferTest9
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Testing the methods");          
      System.out.println(s);
      s.replace(12,19,"replace()");
      System.out.println(s);
   }
 } 