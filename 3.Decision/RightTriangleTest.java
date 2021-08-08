 class RightTriangleTest
 {
   public static void main(String [] args)
   {
      float h,s1,s2;
      h = Float.parseFloat(args[0]);
      s1 = Float.parseFloat(args[1]);
      s2 = Float.parseFloat(args[2]);
     if(h*h == s1*s1 + s2*s2)
       System.out.println("Triangle is right angled");
     else
       System.out.println("Triangle is not right angled");
   }
 }