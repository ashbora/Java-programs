 abstract class Shape2D
 {
    double d1,d2;
    void setDimensions(double d1,double d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }
    void displayDimensions()
    {
        System.out.println("First dimension :"+d1+"\tSecond dimension :"+d2);
    }
   abstract void area();
 }
 class Rectangle extends Shape2D     //concrete subclass
 {
   void area()
   {
      double a = d1*d2;
      System.out.println("Area of rectangle :"+a);
   }
 }
 class Inh14
 {
    public static void main(String [] args)
    {
         Rectangle s = new Rectangle(); 
         s.setDimensions(15.4,12.9);
         s.displayDimensions();
         s.area();
    }
 }