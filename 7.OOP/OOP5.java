/*object referencing*/
 class Sample
 {
   int x,y,z;
   void setData(int a,int b,int c)
   {
      x=a; y=b; z=c;
   }
   void putData()
   {
      System.out.println("x="+x+"\ty="+y+"\tz="+z);
   }   
 }
 class OOP5
 {
   public static void main(String [] args)
   {
       Sample s1,s2;
       s1=new Sample();
       s2=s1;                  //s2 referes to s1
       s1.setData(10,20,30);
       s1.putData();
       s2.putData();
   }
 }   
