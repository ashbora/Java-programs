  class Base
  {
     Base()
     {
       System.out.println("Inside Base class default constructor");
     }
  }
  class Derived extends Base
  {
    int v;
    Derived(int a)
    {v = a;
     System.out.println("Inside Derived class parameterised constructor");
    }
    void show()
    {
      System.out.println("The value is "+v); 
    }
  }
  class Inh6
  {
     public static void main(String [] args)
    {
       Derived d = new Derived(15);
       d.show();
    }
  }