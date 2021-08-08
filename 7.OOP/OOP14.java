  class Test
  {
    static int cnt;
    int sr;
    Test()
    {
      cnt++;
      sr = cnt;
    }
    void show()
    {
      System.out.println("I am object number "+sr);
    }
   static void showCount()
   {
     System.out.println("Total objects :"+cnt);
   }
  }
  class OOP14
  {
     public static void main(String [] args)
     {
        Test.showCount();     
        Test t1,t2,t3;
        t1 = new Test();
        t2 = new Test();
        t3 = new Test();
        Test.showCount();
        t1.show();
        t2.show();
        t3.show();
     }
  }