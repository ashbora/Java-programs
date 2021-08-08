 /*
  difference between equals() and ==
*/
 class StringTest22
 {
   public static void main(String [] args)
   {
      
       String s1 = "Elegant";
       String s2 = new String(s1);
       String s3 = s1;
       System.out.println("s1 equals s2 = "+s1.equals(s2));
       System.out.println("s1 == s2 = "+(s1==s2));
       System.out.println("s1 == s3 = "+(s1==s3));
   }
 }