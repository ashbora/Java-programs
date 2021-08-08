/*
  void ensureCapacity(int capacity)
*/

class StringBufferTest2
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Time is money.");
     System.out.println("S       :"+s);
     System.out.println("Capacity :"+s.capacity());
     s.ensureCapacity(100);
     System.out.println("\nS       :"+s);
     System.out.println("Capacity :"+s.capacity());

  }  

}