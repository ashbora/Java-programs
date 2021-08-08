 /*Method overriding */
 class A
 {
    int x,y;
    void setData(int x,int y)
    {
       this.x = x;
       this.y = y;
    }
    void display()
    {
       System.out.println("x="+x+"\ty="+y);
    }
 }
 class B extends A
 {
   int z;
   void setData(int x,int y,int z)
   {
     this.x = x;
     this.y = y; 
     this.z = z;
   }
   void display()       //overrides the super class version          
   {
      System.out.println("x="+x+"\ty="+y+"\tz="+z);    
   }      
 }
 class Inh4
 {
   public static void main(String [] args)
   {
       B b1 = new B();
       b1.setData(10,20);
       b1.display();
       B b2 = new B();
       b2.setData(50,60,70);
       b2.display();
   }
 }