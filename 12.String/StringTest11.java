/*
  difference between equals() and ==
*/
class StringTest11
{
  public static void main(String [] args)
  {
     String s1="Taj Mahal is one of the 7 wonders";
     String s2 = new String(s1);
     String s3 = s1;

     System.out.println("First string equals second :"+s1.equals(s2));
     System.out.println("First string == second     :"+(s1==s2));
     System.out.println("First string == third     :"+(s1==s3));
  }
}