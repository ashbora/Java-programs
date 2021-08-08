/*
   char [] toCharArray()
*/
class StringTest7
{
  public static void main(String [] args)
  {
     String s = "I Love My India very much";
     char c[] = s.toCharArray();
     for(int i=0;i<c.length;i++)
        System.out.print(c[i]+" ");
  }
}