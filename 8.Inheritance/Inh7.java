  class Base
  { 
     int v;
     Base(int x)
     {
       v=x;
     }
     void show()
     {
      System.out.println("Base class value :"+v);
     }
  }
  class Derived extends Base
  { 
    int w;
    Derived(int a,int b)
    {
      super(a);    //invokes base class constructor with 1 integer argument
      w = b;
    }
    void show()
    {
      super.show(); //invokes base class version of method show()
      System.out.println("Derived class value :"+w);
    }
  }
  class Inh7
  {
     public static void main(String [] args)
    {
       Derived d = new Derived(15,20);
       d.show();
    }
  }