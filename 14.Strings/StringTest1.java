 /*
   String()
   String(char chars[])
   String(char chars[],int startIndex,int numChars)
   String(String strobj)
   String(byte asciiChars[])
   String(byte asciiChars[],int startIndex,int numChars)
 */
 class StringTest1
 {
   public static void main(String [] args)
   {
      String s1 = new String();
      System.out.println("First string :" + s1);

      char ch[]={'E','l','e','g','a','n','t',' ','I','T'};
      String s2 = new String(ch);
      System.out.println("Second string :" + s2);

      String s3 = new String(ch,4,3);
      System.out.println("Third string :" + s3);
 
      String s4 = new String(s2);
      System.out.println("Fourth string :" + s4);

      byte b[]={65,66,67,68,69,70,71,72,73,74};
      String s5 = new String(b);
      System.out.println("Fifth string :" + s5);

      String s6 = new String(b,3,5);
      System.out.println("Sixth string :" + s6);

   }
 }