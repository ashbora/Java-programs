/*
   StringBuffer()
   StringBuffer(int size)
   StringBuffer(String str)
   void ensureCapacity(int capacity)
*/
 class StringBufferTest1
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Yavatmal");
      s.ensureCapacity(150);
      System.out.println("Length   :"+s.length());
      System.out.println("Capacity :"+s.capacity());
   }
 } 