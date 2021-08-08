 class MathTest3
 {
     public static void main(String [] args)
     {
         double v = Double.parseDouble(args[0]);
         double sr = Math.sqrt(v);
         double cr = Math.cbrt(v);
         System.out.println("Square root  :"+sr);
         System.out.println("Cube root     :"+cr);
     }
 }