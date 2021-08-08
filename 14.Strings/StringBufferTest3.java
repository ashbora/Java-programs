/*
  char charAt(int where)
  void setCharAt(int where,char ch)
*/ 
class StringBufferTest3
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Yavatmal");          
      System.out.println(s); 
      System.out.println("Character at location 5 :"+s.charAt(5));
      s.setCharAt(5,'v');
      System.out.println(s); 
   }
 } 