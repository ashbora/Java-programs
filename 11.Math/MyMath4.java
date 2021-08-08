/*
   static double log(double arg)
   static double log10(double arg)
   static double log1p(double arg)
*/
class MyMath4
{
  public static void main(String [] args)
  {
    double num = Double.parseDouble(args[0]);
    double l1 = Math.log(num);
    double l2 = Math.log10(num);
    double l3 = Math.log1p(num);
    System.out.println("Natural log of "+num+" is "+l1);
    System.out.println("Base 10 log of "+num+" is "+l2);
    System.out.println("Natural log of "+num+"+1 is "+l3);
  }
}