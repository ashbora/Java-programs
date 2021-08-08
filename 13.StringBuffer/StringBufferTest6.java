/*
  StringBuffer insert(int index,String str)
  StringBuffer insert(int index,int num)
  StringBuffer insert(int index,Object obj)
*/

class StringBufferTest6
{
  public static void main(String [] args)
  {
     StringBuffer s = new StringBuffer("Testing StringBuffer");
     System.out.println(s);
     s.insert(8,"Java ");
     System.out.println(s);
  }  
}