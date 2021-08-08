 /*
  void getChars(int sourceStart,int sourceEnd,char target[],int targetStart)
 */
 class StringTest5
 {
   public static void main(String [] args)
   {
     String s = "Java Programming"; 
     char t[] = new char[7];
     s.getChars(5,12,t,0);
     for(char ch:t)
      System.out.println(ch);
   }
 }