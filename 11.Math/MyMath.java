// static double sin(double arg)
class MyMath
{
  public static void main(String [] args)
  {
     double ang = Double.parseDouble(args[0]);  
     double rad = Math.toRadians(ang);
     double s = Math.sin(rad);
     System.out.println("Sine of angle "+ang+" is "+s);
  }
}