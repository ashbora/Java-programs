abstract class A
{
   void display()
   { System.out.println("Inside class A,display() method");}

   abstract void show(); //must be overridden by sub class
}

class B extends A 
{
 void show()
 { System.out.println("Inside overridden method show()");}
}

class Inh9
{
  public static void main(String [] args)
  {
      B obj = new B();
      obj.display();
      obj.show();
  }
}
