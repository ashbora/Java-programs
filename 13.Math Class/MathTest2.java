 class MathTest2
 {
     public static void main(String [] args)
     {
         double s = Double.parseDouble(args[0]);
         double r = Math.asin(s);
         double a = Math.toDegrees(r);
         System.out.println("Angle of sine "+s+" is :"+a+" degrees");
     }
 }