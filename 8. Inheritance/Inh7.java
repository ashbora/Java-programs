class A
{
   final void show()
   { System.out.println("Inside class A,show() method");}

   void display()
   { System.out.println("Inside class A,display() method");}
}

class B extends A
{
   void show()   //error - cannot override final method
   { System.out.println("Inside class B,show() method");}

   void display()
   { System.out.println("Inside class B,display() method");}
}
class Inh7
{
  public static void main(String [] args)
  {
      B obj = new B();
      obj.show();
      obj.display();
  }
}
