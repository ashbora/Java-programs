 /*
  boolean endsWith(String str)
*/
 class StringTest11
 {
   public static void main(String [] args)
   {
     String s1 = "Java supports OOP";    
     System.out.println(s1+" ends with Java :"+s1.endsWith("Java"));
     System.out.println(s1+" ends with OOP  :"+s1.endsWith("OOP"));

   }
 }