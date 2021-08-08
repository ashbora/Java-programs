/*
  StringBuffer replace(int startIndex,int endIndex,String str)
*/

class StringBufferTest9
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Testing Java String");
     System.out.println(s);
     s.replace(8,12,"C++");
     System.out.println(s);
  }  
}