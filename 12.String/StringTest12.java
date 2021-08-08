/*
  int compareTo(String str)
  int compareToIgnoreCase(String str)
*/
class StringTest12
{
  public static void main(String [] args)
  {
     String s1 = args[0];
     String s2 = args[1];
     int k = s1.compareTo(s2);
     if(k<0)
        System.out.println("First string is less than second");
     else
       if(k>0)
          System.out.println("First string is greater than second");
       else    
          System.out.println("Both strings are same");
  }
}