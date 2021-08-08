 class Triangle
 {
     double base,height;
     void setDimensions(double b,double h)
     {
          base=b;
          height=h;
     }
    void area()
     {
       double a = base*height/2;
       System.out.println("Area of triangle :"+a);
     }
 }
 class OOP2
 {
   public static void main(String [] args)
   {
       double b = Double.parseDouble(args[0]);
       double h = Double.parseDouble(args[1]);
       Triangle tri = new Triangle();
       tri.setDimensions(b,h);
       tri.area();
   }
 }
