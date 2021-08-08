/*
  StringBuffer append(String str)
  StringBuffer append(int num)
  StringBuffer append(Object obj)
*/

class StringBufferTest5
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Testing string ");
     System.out.println(s);
     s.append("Java & C++");
     System.out.println(s);
     s.append(990);
     s.append(56.98).append(true).append('H');
     System.out.println(s);
  }  
}