class Base
{
   void first(){System.out.println("Inside method first"); }
   void second(){System.out.println("Inside method second"); }
}

interface MyInterface
{
  void method1();
  void method2();
}

class Test extends Base implements MyInterface
{
  public void method1(){ System.out.println("Inside method 1");}
  public void method2(){ System.out.println("Inside method 2");}
}
class MyClass3
{
  public static void main(String [] args)
  {
     Test obj = new Test();
     obj.first();
     obj.second();
     obj.method1();
     obj.method2();
  }
}