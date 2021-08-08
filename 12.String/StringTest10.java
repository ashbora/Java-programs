/*
  boolean startsWith(String sb)
  boolean startsWith(String sb,int startIndex)
  boolean endsWith(String sb)
*/
class StringTest10
{
  public static void main(String [] args)
  {
     String s1="Taj Mahal is one of the 7 wonders";
     
     System.out.println("Is the string begins with Taj :"+s1.startsWith("Taj"));
     System.out.println("Is the string ends with Taj :"+s1.endsWith("Taj"));
     System.out.println("Is the string contains Mahal at location 4 :"+s1.startsWith("Mahal",4));

  }
}