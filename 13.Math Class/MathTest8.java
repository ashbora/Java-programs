 class MathTest8
 {
     public static void main(String [] args)
     {
         double a = Double.parseDouble(args[0]);
         double b = Double.parseDouble(args[1]);
         double l = Math.max(a,b);
         double s = Math.min(a,b);
         System.out.println("Larger value   :"+l);
         System.out.println("Smaller value  :"+s);
     }
 }