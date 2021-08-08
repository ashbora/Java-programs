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


class MethodOverloading
{
  public static void main(String [] args)
  {
     Test test1 = new Test();
     Test test2 = new Test();
     Test test3 = new Test();

     test1.setData(15);
     test2.setData(54,23,88);
     test3.setData();

     test1.display(); 
     test2.display();
     test3.display();
  }
}