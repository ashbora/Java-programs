/*
  static String valueOf(double num)
  static String valueOf(long num)
  static String valueOf(Object obj)
  static String valueOf(char chats[])

*/

class StringTest19
{
  public static void main(String [] args)
  {
     int m=5678;
     float f = 873.344f;
     String s1 = String.valueOf(m).concat(String.valueOf(f));
     System.out.println(s1);
 //    System.out.println(String.valueOf(m));
 //  System.out.println(String.valueOf(f));
  }
}