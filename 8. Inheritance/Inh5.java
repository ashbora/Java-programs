class A
{
   A()
   {
     System.out.println("Inside class A constructor");
   }
}

class B extends A
{
   B()
   {
      System.out.println("Inside class B constructor");
   }
}
class C extends B
{
   C()
   {
      System.out.println("Inside class C constructor");
   }
}
class Inh5
{
   public static void main(String [] args)
   {
     C c = new C();
   }
}