 class MathTest4
 {
     public static void main(String [] args)
     {
         double v = Double.parseDouble(args[0]);
         double ln = Math.log(v);
         double l10 = Math.log10(v);
         double ln1 = Math.log1p(v);
         System.out.println("Natural log of "+v+"  :"+ln);
         System.out.println("Base 10 log of "+v+"  :"+l10);
         System.out.println("Natural log of "+(v+1)+"  :"+ln1);
     }
 }