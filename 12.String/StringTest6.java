/*
   byte [] getBytes()
*/
class StringTest6
{
  public static void main(String [] args)
  {
     String s = "I Love My India very much";
     byte t[] = s.getBytes();
     for(int i=0;i<t.length;i++)
        System.out.print(t[i]+" ");
  }
}