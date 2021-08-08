/*
   void getChars(int sourceStart,int sourceEnd,char target[],int targetStart)
*/
class StringTest5
{
  public static void main(String [] args)
  {
     String s = "I Love My India very much";
     char t[] = new char[8];
     s.getChars(7,15,t,0);
     for(int i=0;i<t.length;i++)
        System.out.print(t[i]+" ");
  }
}