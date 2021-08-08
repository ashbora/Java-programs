/*
  char charAt(int loc)
  void setCharAt(int loc,char ch)
*/

class StringBufferTest4
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Prevention is better than cure.");
     System.out.println("String buffer is :"+s);
     System.out.println("Character at location 5:"+s.charAt(5));
     s.setCharAt(2,'o');
     System.out.println("String buffer is :"+s);

  }  
}