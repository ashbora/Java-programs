final class A
{
   void display()
   { System.out.println("Inside class A,display() method");}
}

class B extends A    //error - cannot inherit final class
{
   void show()
   { System.out.println("Inside class B,show() method");}
}
class Inh8
{
  public static void main(String [] args)
  {
      B obj = new B();
      obj.show();
      obj.display();
  }
}
