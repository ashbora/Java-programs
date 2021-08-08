class Test
{
  int x,y,z;
  void setData()
  {
    x=y=z=1;
  }

  void setData(int a)
  {
    x=y=z=a;
  }

  void setData(int a,int b,int c)
  {
    x=a; y=b; z=c;
  }

  void display()
  {
    System.out.println("x="+x+"\ty="+y+"\tz="+z);
  }
}

class MethodOverloading1
{
  public static void main(String [] args)
  {
     Test test; 
     test = new Test();
     test.setData(15);
     test.display(); 
     test.setData(54,23,88);
     test.display();
     test.setData();
     test.display();
  }
}