 /* A class can extend another class along with implementation of interface/interfaces at a time*/
   class clsBase
   {
      void method1(){}
      void method2(){}
   }   
   interface intSample
   {
      void method3();
      void method4();
   }
  
  class Test extends clsBase implements intSample
  {
      public void method3(){}
      public void method4(){}
  }
  class InterfaceDemo5
  {
    public static void main(String []args)
    {
       Test test = new Test();
    }
  }