 class Base
 {
   void show()
   {
      System.out.println("Inside Base class show method");
   }
 }
 class Sub1 extends Base
 {
   void show()
   {
      System.out.println("Inside Sub1 class show method");
   }
 }
 class Sub2 extends Base
 {
   void show()
   {
      System.out.println("Inside Sub2 class show method");
   }
 }
 class Sub3 extends Base
 {
   void show()
   {
      System.out.println("Inside Sub3 class show method");
   }
 }
 class Inh11
 {
    public static void main(String [] args)
    {
        Base b;
        Sub1 obj1 = new Sub1();
        Sub2 obj2 = new Sub2();
        Sub3 obj3 = new Sub3();
        b = obj1;      //Base class object refers to Sub1 class object
        b.show();
        b = obj2;      //Base class object refers to Sub2 class object
        b.show();
        b = obj3;      //Base class object refers to Sub3 class object
        b.show();     
    }
 }