interface One
{
   void method1();
   void method2();
}
interface Two extends One
{
   void method3();
   void method4();
}
class Sample implements Two
{
  public void method1(){ System.out.println("Method 1");}
  public void method2(){ System.out.println("Method 2");}
  public void method3(){ System.out.println("Method 3");}
  public void method4(){ System.out.println("Method 4");}
}
class MyClass2
{
  public static void main(String [] args)
  {
     Sample s = new Sample();
     s.method1();
     s.method2();
     s.method3();
     s.method4();
  }
}