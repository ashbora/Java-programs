 /*
  byte [] getBytes()
 */
 class StringTest6
 {
   public static void main(String [] args)
   {
     String s = "Java Programming"; 
     byte b[] = s.getBytes();
     for(byte ch:b)
       System.out.println(ch);
   }
 }