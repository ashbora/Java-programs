  /* returning object from a class method */
  class Sample
  {
     int x,y,z;
     Sample()
     {x=y=z=0; }
  
     Sample(int a,int b,int c)
     {x=a; y=b; z=c; }

     void display()
     {System.out.println("x="+x+"\ty="+y+"\tz="+z); }

     Sample add(Sample t)
     { 
       Sample r = new Sample();
       r.x = x + t.x;
       r.y = y + t.y;
       r.z = z + t.z; 
       return r;
     }
  }
  class OOP9
  {
    public static void main(String args[])
    {
       Sample s1,s2,s3;
       s1 = new Sample(22,53,29);
       s2 = new Sample(76,65,39);
       s3 = new Sample();
       s3 = s1.add(s2);
       s1.display();
       s2.display();
       s3.display();
    }
  }