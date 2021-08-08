class A
{
  void first()
  { System.out.println("Inside method first");}

  void second()
  { System.out.println("Inside method second");}
}

class B extends A
{
  void third()
  { System.out.println("Inside method third");}

  void fourth()
  { System.out.println("Inside method fourth");}
}
class Inh1
{
  public static void main(String [] args)
  {
       B b = new B();
       b.first();
       b.second();
       b.third();
       b.fourth();
  }
}