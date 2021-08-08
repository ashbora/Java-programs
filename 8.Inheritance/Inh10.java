  class A
  {
    void show()
    {
       System.out.println("Inside Super class show method");
    }
  } 
  class B extends A
  {
     void show()    //overrides super class show method
     {
       System.out.println("Inside Sub class display method");
     }
  }
 class Inh10  
 {
   public static void main(String [] args)
   {    
      B b = new B();    //object of sub-class
      A a = b;          //reference object from super-class
      a.show();         //executes a copy of show method from sub-class
   }
 }