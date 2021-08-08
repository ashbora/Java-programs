 /*
  boolean regionMatches(int startIndex,String str2,int str2startIndex,int numchars)
  boolean regionMatches(boolean ignoreCase,int startIndex,String str2,int str2startIndex,int numchars) 
*/
 class StringTest9
 {
   public static void main(String [] args)
   {
     String s1 = "I like Java";
     String s2 = "JAva supports OOP";    
     System.out.println(s1.regionMatches(true,7,s2,0,4) );
   }
 }