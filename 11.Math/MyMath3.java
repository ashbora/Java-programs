/*
   static double exp(double arg)
   static double expm1(double arg)
*/
class MyMath3
{
  public static void main(String [] args)
  {
    double num = Double.parseDouble(args[0]);
    double e1 = Math.exp(num);
    double e2 = Math.expm1(num);
    System.out.println("Expontial value of "+num+" is "+e1);
    System.out.println("Expontial value -1 of "+num+" is "+e2);
  }
}