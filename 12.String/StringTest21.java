/*
  String [] split(String regexp)
  String [] split(String regexp,int max)

*/

class StringTest21
{ public static void main(String [] args)
  {
      String s = "India is my country; I love my India; India have many cultures";
      String st[] = s.split(" ",7);
      for(int i=0;i<st.length;i++) 
        System.out.println(st[i]);
  }
}