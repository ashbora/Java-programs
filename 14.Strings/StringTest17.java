 /*
  String concatenation
 1. use of + operator
 2. use of concat function
    String concat(String str)

*/
 class StringTest17
 {
   public static void main(String [] args)
   {
      String s="One";
      String s1 = s+"Two";
      String s2 = s1.concat("Three");
      System.out.println(s);
      System.out.println(s1);
      System.out.println(s2);
   }
 }