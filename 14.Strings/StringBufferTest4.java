/*
   StringBuffer append(String str)
   StringBuffer append(int num)
   StringBuffer append(float num)
   StringBuffer append(Object obj)
*/
 class StringBufferTest4
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Yavatmal");          
      System.out.println(s);
      s.append('-');
      System.out.println(s);
      long pin=445001;
      s.append(pin);   
      System.out.println(s); 
   }
 } 