/*
    String()
    String(char chars[])
    String(char chars[],int startIndex,int numchars)
    String(String obj) 
    String(byte asciichars[])
    String(byte asciichars[],int startIndex,int numchars)
    String(StringBuffer obj) 
    String(StringBuilder obj) 
    String(int codePoints[],int startIndex,int numChars) 
*/

class StringTest1
{
  public static void main(String args[])
  {
     String s1 = new String();
     System.out.println("S1 : "+s1);

     char [] c ={'E','l','e','g','a','n','t',' ','I','T',' ','Y','a','v','a','t','m','a','l'};
     String s2 = new String(c);
     System.out.println("S2 : "+s2);

     String s3 = new String(c,11,8);
     System.out.println("S3 : "+s3);

     String s4 = new String(s2);
     System.out.println("S4 : "+s4);

     byte [] b = {65,66,67,68,69,70,71,72,73};
     String s5 = new String(b);
     System.out.println("S5 : "+s5);

     String s6 = new String(b,3,5);
     System.out.println("S6 : "+s6);

     String s7 = "Java Language";
     System.out.println("S7 : "+s7);
  }
}