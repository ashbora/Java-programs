 /*
   String substring(int startIndex)
   String substring(int startIndex,int endIndex) 
*/
 class StringTest16
 {
   public static void main(String [] args)
   {
      String s="Incrediable India";
      String s1 = s.substring(12);
      String s2 = s.substring(12,15);
      System.out.println("First substring :"+s1);
      System.out.println("Second substring :"+s2);
   }
 }