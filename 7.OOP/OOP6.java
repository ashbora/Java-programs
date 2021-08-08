 class Circle
 {
    double rad;
    void setRadius(double r)
    {rad = r;}
    
    double area()
    { return Math.PI*rad*rad; }
  
    double circumference()
    {return 2*Math.PI*rad ; }
 }
 class OOP6
 {
   public static void main(String [] args)
   {
       Circle circle = new Circle();
       circle.setRadius(7.99);
       double a = circle.area();
       System.out.println("Area of circle  :"+a);
       System.out.println("Circumference of circle :"+circle.circumference());
   }
 }