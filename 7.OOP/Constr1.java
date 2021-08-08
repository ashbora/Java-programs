 class Box
 {
  double l,b,h;
  Box()
  {
    l=9.0;
    b=4.3;
    h=5.6;
  }
  void showDimensions()
  {
     System.out.println("Dimensions of box ->Length :"+l+"\tBreadth  :"+b+"\tHeight  :"+h);
  }
  void volume()
  {
    double v = l*b*h;
    System.out.println("Volume of box :"+v);
  }
  void surfaceArea()
  {
    double sa = 2*(l*b+l*h+b*h);
    System.out.println("Surface area of box :"+sa); 
  }
 }
 class Constr1
 {
   public static void main(String [] args)
   { 
       Box box = new Box();
       box.showDimensions();
       box.volume();
       box.surfaceArea();
   }
 }
