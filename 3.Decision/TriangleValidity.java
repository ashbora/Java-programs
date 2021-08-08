 class TriangleValidity
 {
   public static void main(String [] args)
   {
      float s1,s2,s3;
      s1 = Float.parseFloat(args[0]);
      s2 = Float.parseFloat(args[1]);
      s3 = Float.parseFloat(args[2]);
      if(s1+s2 > s3 && s1+s3 > s2 && s2+s3 > s1)
      {
         System.out.println("Triangle is valid");
         if(s1==s2 && s1==s3)
             System.out.println("Type:Equilateral triangle");
         else
            if(s1==s2 || s1==s3 || s2==s3)
                System.out.println("Type:Isoscaleous triangle");
            else
                System.out.println("Type:Scalene triangle");
      }
      else
         System.out.println("Triangle is not valid");
   }
 }