  class Circle
  {
    double rad;
    void setRadius(double r)
    { rad = r; }

    void area()
    {
      double a = Math.PI*rad*rad;
      System.out.println("Area of circle :"+a);
    }

    void circumference()
    {
      double c = 2*Math.PI*rad;
      System.out.println("Circumference of circle :"+c); 
    }
  } 
  class OOP1
  {
    public static void main(String [] args)
    {
       Circle c;           //object declaration
       c = new Circle();   //object creation
       double r = Double.parseDouble(args[0]);
       c.setRadius(r);     
       c.area();
       c.circumference();
    }
  }