 class Sample
 {
    int x,y;
    static int z;
    Sample(int a,int b,int c)
    {
       x=a; y=b; z=c;  
    }
    
    void display()
    {
      System.out.println("x="+x+"\ty="+y+"\tz="+z); 
    } 
    static void showCommon()
    {
      System.out.println("Common data :"+z);
    }
 }
 class OOP13
 {
    public static void main(String [] args)
    {
        Sample s1,s2,s3;
        s1 = new Sample(10,20,30);
        s2 = new Sample(40,50,60);
        s3 = new Sample(70,80,90);
        s1.display();
        s2.display();
        s3.display();
        Sample.showCommon();    //calling a static method
    }
 }