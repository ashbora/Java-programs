 /* use of final class */
 class A
 {
   void methodA()
   {} 
 }
 final class B extends A
 {
   void methodB()
   {}
 }
 class C extends B  //error - can not inherit final class
 {
   void methodC()
   {}
 }
class Inh13
 {
   public static void main(String [] args)
   {
      C c = new C();
      c.methodA();
      c.methodB();
      c.methodC();
   }
 }