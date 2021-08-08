 /*
   static String valueOf(double num)
   static String valueOf(float num)
   static String valueOf(long num)
   static String valueOf(int num)
   static String valueOf(char char[])
   static String valueOf(Object obj)
*/
 class StringTest20
 {
   public static void main(String [] args)
   {
       double d = 633.566;
       String s1 = String.valueOf(d);  
       String s2 = d;  
       System.out.println(s1);
       System.out.println(s2);

   }
 }