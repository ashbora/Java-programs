/*
  StringBuffer delete(int startIndex,int endIndex)
  StringBuffer deleteCharAt(int index)
*/

class StringBufferTest8
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Testing Java StringBuffer");
     System.out.println(s);
     s.delete(8,13);
     System.out.println(s);
     s.deleteCharAt(8);
     System.out.println(s);
  }  
}