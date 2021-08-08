  class A
  {
    void show()
    {
       System.out.println("Inside Super class show method");
    }
  } 
  class B extends A
  {
     void display()
     {
       System.out.println("Inside Sub class display method");
     }
  }
 class Inh9  
 {
   public static void main(String [] args)
   {
      
      B b = new B();    //object of sub-class
      A a = b;          //reference object from super-class
      a.show();
      //a.display();     //can-not access new properties of sub-class
   }
 }