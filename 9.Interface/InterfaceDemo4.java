 /* A class can implement more than one interfaces at a time*/

   interface A
   {
      void method1();
      void method2();
   }   
  interface B
  {
      void method3();
      void method4();
   }
  interface C
  {
     void method5();
     void method6();
  }
  class Test implements A,B,C
 {
      public void method1(){}
      public void method2(){}
      public void method3(){}
      public void method4(){}
      public void method5(){}
      public void method6(){}
 }
 class InterfaceDemo4
 {
    public static void main(String []args)
   {
       Test test = new Test();
   }
 }