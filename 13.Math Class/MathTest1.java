 class MathTest1
 {
     public static void main(String [] args)
     {
         double a = Double.parseDouble(args[0]);
         double r = Math.toRadians(a);
         double s = Math.sin(r);
         System.out.println("Sine of angle "+a+" degrees :"+s);
     }
 }