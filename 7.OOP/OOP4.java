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
 class OOP4
 {
   public static void main(String [] args)
   {
       Sample s1,s2,s3;
       s1=new Sample();
       s2=new Sample();
       s3=new Sample();
       s1.setData(10,20,30);
       s2.setData(40,50,60);
       s3.setData(70,80,90);
       s1.putData();
       s2.putData();
       s3.putData();
   }
 }   
