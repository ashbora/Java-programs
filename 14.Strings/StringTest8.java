 /*
  boolean equals(Object str)
  boolean equalsIgnoreCase(Object str)
 */
 class StringTest8
 {
   public static void main(String [] args)
   {
     String s1 = "Java";
     String s2 = "Java";
     String s3 = "OOPs";
     String s4 = "JAVA";

     System.out.println(s1+" equals "+s2+" = "+s1.equals(s2));
     System.out.println(s1+" equals "+s3+" = "+s1.equals(s3));
     System.out.println(s1+" equals "+s4+" = "+s1.equals(s4));
     System.out.println(s1+" equalsIgnoreCase "+s4+" = "+s1.equalsIgnoreCase(s4));
   }
 }