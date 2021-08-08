/*
  boolean equals(Object str)
  boolean equalsIgnoreCase(Object str)
*/

class StringTest8
{
  public static void main(String [] args)
  {
     String s1="Ain't my fault";
     String s2="Is my fault";
     String s3="Ain't my fault";
     String s4="AIN'T My fault";
     
     System.out.println(s1+" equals "+s2+" = "+ s1.equals(s2)); 
     System.out.println(s1+" equals "+s3+" = "+ s1.equals(s3)); 
     System.out.println(s1+" equals "+s4+" = "+ s1.equals(s4)); 
     System.out.println(s1+" equalsIgnoreCase "+s4+" = "+ s1.equalsIgnoreCase(s4)); 
  }
}