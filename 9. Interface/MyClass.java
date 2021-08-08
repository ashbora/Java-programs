interface Test 
{
   void first();
   void second();
   void third();
   void fourth();
}

class Sample implements Test
{
  public void fourth()
   { System.out.println("Inside method fourth()"); }
  public void third()
   { System.out.println("Inside method third()"); }
  public void second()
   { System.out.println("Inside method second()"); }
  public void first()
   { System.out.println("Inside method first()"); }
}

class MyClass
{
  public static void main(String [] args)
  {
     Sample s = new Sample();
     s.first();
     s.second();
     s.third();
     s.fourth();
  }
} 

