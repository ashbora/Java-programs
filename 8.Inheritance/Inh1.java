  class A
  {
    void method1()
    {System.out.println("Inside method1");}

    void method2()
    {System.out.println("Inside method2");}

  }
  class B extends A
  {
    void method3()
    {System.out.println("Inside method3");}

    void method4()
    {System.out.println("Inside method4");}

  }
  class Inh1
  {
     public static void main(String [] args)
     {
        B obj = new B();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
     }
  }
