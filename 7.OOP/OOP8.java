  /* object as argument */
  class Sample
  {
     int x,y,z;
     Sample()
     {x=y=z=0; }
  
     Sample(int a,int b,int c)
     {x=a; y=b; z=c; }

     void display()
     {System.out.println("x="+x+"\ty="+y+"\tz="+z); }

     void add(Sample t1,Sample t2)
     {
       x = t1.x + t2.x;
       y = t1.y + t2.y;
       z = t1.z + t2.z; 
     }
  }
  class OOP8
  {
    public static void main(String args[])
    {
       Sample s1,s2,s3;
       s1 = new Sample(22,53,29);
       s2 = new Sample(76,65,39);
       s3 = new Sample();
       s3.add(s1,s2);
       s1.display();
       s2.display();
       s3.display();
    }
  }