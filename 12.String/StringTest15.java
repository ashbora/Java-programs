/*
  String substring(int startIndex)
  String substring(int startIndex,int endIndex)

*/

class StringTest15
{
  public static void main(String [] args)
  {
     String str = "James Glosling and team invented Java at Sun Microsystem";
     String s1 = str.substring(20);
     String s2 = str.substring(20,35);
     System.out.println(s1);
     System.out.println(s2);
  }
}