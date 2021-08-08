/*
   static double sqrt(double arg)
   static double cbrt(double arg)
*/
class MyMath2
{
  public static void main(String [] args)
  {
    double num = Double.parseDouble(args[0]);
    double sq = Math.sqrt(num);
    double cb = Math.cbrt(num);
    System.out.println("Square root is "+sq);
    System.out.println("Cube root is "+cb);
  }
}