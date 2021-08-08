class Test
{
   int x;
   static int y;
   void setData(int a,int b)
   {
      x=a;
      y=b;
   }
   void display()
   {
      System.out.println("x="+x+"\ty="+y);
   }
   static void commonData()
   {
      System.out.println("Common data :"+y);
   }
}
class SharedTest1
{
  public static void main(String [] args)
  {
       Test t1 = new Test();
       Test t2 = new Test();
       Test t3 = new Test();

       t1.setData(10,20);
       t2.setData(30,40);
       t3.setData(50,60);

       t1.display();
       t2.display();
       t3.display();
       
       Test.commonData(); 
  }
}