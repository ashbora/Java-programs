  interface First
  {
     void one();
     void two();
  }
  interface Second extends First
  {
     void third();
     void fourth();
  }
  class Test implements Second
  {
      public void one(){}
      public void two(){}
      public void third(){}
      public void fourth(){}
  }
 class InterfaceDemo2
 {
    public static void main(String [] args)
    {
        Test t = new Test();
    }
 }