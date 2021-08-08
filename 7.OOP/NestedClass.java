 class A
 {
  int x;
  B b = new B();
  void setData(int v1,int v2)
  {
     x=v1;
     b.setData(v2);
  }
  class B    //inner class
  {
    int y;
    void setData(int v)
    {
       y = v;
    }
    void display()
    {
      System.out.println("Inner class value is "+y);
      System.out.println("Outer class value is "+x);
    }
  } 
  void putData()
  {
    System.out.println("Outer class value is "+x);
    System.out.println("From Inner class");   
    b.display();
  }
 }
 class NestedClass
 {
    public static void main(String [] args)
    {
        A a = new A();
        a.setData(10,20);
        a.putData();
    }
 }