/*
  String substring(int startIndex)
  String substring(int startIndex,int endIndex)

*/

class StringBufferTest10
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Testing Java String");
     System.out.println(s);
     String s1 = s.substring(8);
     System.out.println(s1);
     String s2 = s.substring(8,13);
     System.out.println(s2);
  }  
}