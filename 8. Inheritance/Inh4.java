class Shape2D
{
   double dim1,dim2;
   void setDimensions(double dim1,double dim2)
   {
      this.dim1 = dim1;
      this.dim2 = dim2;
   }
   void displayDimensions()
   {
      System.out.println("First dimension  :"+dim1);
      System.out.println("Second dimension :"+dim2);
   }
}

class Triangle extends Shape2D
{
   void displayDimensions()
   {
      System.out.println("Base of triangle   :"+dim1);
      System.out.println("Height of triangle :"+dim2);
   }

   void area()
   {
     double a = dim1*dim2/2;
     System.out.println("Area of triangle  :"+a);
   }
}
class Rectangle extends Shape2D
{
  void displayDimensions()
   {
      System.out.println("Length of rectangle   :"+dim1);
      System.out.println("Breadth of rectangle :"+dim2);
   }
   void area()
   {
     double a = dim1*dim2;
     System.out.println("Area of rectangle :"+a);   
   }
   void perimeter()
   {
     double p = 2*(dim1+dim2);
     System.out.println("Perimeter of rectangle :"+p);
   }
}
class Inh4
{
   public static void main(String [] args)
   {
      Triangle t = new Triangle();
      t.setDimensions(28.45,29.7);
      t.displayDimensions();
      t.area(); 

      Rectangle r = new Rectangle();
      r.setDimensions(50.60,39.56);
      r.displayDimensions();
      r.area();
      r.perimeter();
   }
}