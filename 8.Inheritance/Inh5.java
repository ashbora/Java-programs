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
 class Inh5
 {
   public static void main(String [] args)
   {
      B b = new B();
   }
 }