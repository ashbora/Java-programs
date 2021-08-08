 class MathTest9
 {
     public static void main(String [] args)
     {
         double v = Double.parseDouble(args[0]);
         double c = Math.ceil(v);
         double f = Math.floor(v);
         double ri = Math.rint(v);
         long r = Math.round(v);
         System.out.println("Ceil      :"+c);
         System.out.println("Floor    :"+f);
         System.out.println("Rint      :"+ri);
         System.out.println("Round  :"+r);
     }
 }