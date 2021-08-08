class A
{
   A(int x)
   {
     System.out.println("Inside class A constructor, value is "+x);
   }
}

class B extends A
{
   B(int y)
   {  super(y);
      System.out.println("Inside class B constructor");
   }
}
class C extends B
{
   C(int z)
   {  
      super(z);
      System.out.println("Inside class C constructor");     
   }
}
class Inh6
{
   public static void main(String [] args)
   {
     C c = new C(154);
   }
}