  class Sample
  {
    int x,y,z;
    Sample()
    {
      x=y=z=0;
    }
    Sample(int v)
    {
      x=y=z=v; 
    }
    Sample(int a,int b,int c)
    {
      x=a; y=b; z=c;
    }
    void display()
    {
      System.out.println("x="+x+"\ty="+y+"\tz="+z);
    }
  } 
  class Constr3
  {
    public static void main(String [] args)
    {
      Sample s1,s2,s3;
      s1 = new Sample();     //invokes constructor with no argument
      s2 = new Sample(31);   //invokes constructor with one argument
      s3 = new Sample(10,12,15);//invokes constructor with three arguments
      s1.display();
      s2.display();
      s3.display();
    }
  }