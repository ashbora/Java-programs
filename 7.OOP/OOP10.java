  /* using this */
  class Sample
  {
     int x,y,z;
  
     Sample()
     { this.x= this.y= this.z=0; }
  
     Sample(int a,int b,int c)
     {this.x=a; this.y=b; this.z=c; }

     void display()
     {System.out.println("x="+this.x+"\ty="+y+"\tz="+this.z); }
  }
  class OOP10
  {
    public static void main(String args[])
    {
       Sample s1,s2;
       s1 = new Sample(22,53,29);
       s2 = new Sample(76,65,39);
       s1.display();
       s2.display();
    }
  }