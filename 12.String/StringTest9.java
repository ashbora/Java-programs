/*
  boolean regionMatches(int startIndex,String s2,int str2StartIndex,int numChars)
  boolean regionMatches(boolean ignoreCase,int startIndex,String s2, 
                        int str2StartIndex,int numChars)
*/

class StringTest9
{
  public static void main(String [] args)
  {
     String s1="Taj Mahal is one of the 7 wonders";
     String s2="Agra is known as Taj Mahal City";
     
     System.out.println("Result of comparision :"+ s1.regionMatches(true,0,s2,17,9)); 
  }
}