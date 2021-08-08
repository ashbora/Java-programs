/*
   String concatenation - use of +
*/
class StringTest3
{
  public static void main(String [] args)
  {
     String s1 = "First string ";
     String s2 = "Second string";
     String s3 = s1+s2;
     System.out.println(s3);
     s3 = s3 + "Another data";
     s3 = s3 + 456;
     s3 = s3 + " and "+87.65;
     System.out.println(s3);
  }
}