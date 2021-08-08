/*
  int indexOf(int ch) 
  int indexOf(int ch,int startIndex) 
  int indexOf(String str) 
  int indexOf(String str ch,int startIndex) 

  int lastIndexOf(int ch) 
  int lastIndexOf(int ch,int startIndex) 
  int lastIndexOf(String str) 
  int lastIndexOf(String str ch,int startIndex) 

*/
class StringTest14
{
  public static void main(String [] args)
  {
     String s = "James Gosling at AT & T Bell Labs";
     int l1 = s.indexOf('T');
     System.out.println("First occurance of T :"+l1);
     int l2 = s.indexOf('T',l1+1);
     System.out.println("Second occurance of T :"+l2);

  }
}