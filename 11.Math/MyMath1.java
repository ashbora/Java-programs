// static double asin(double arg)
// static double acos(double arg)
// static double atan(double arg)
// static double atan2(double x,double y)
//------------------------------------------------------------
class MyMath1
{
  public static void main(String [] args)
  {
     double s = Double.parseDouble(args[0]);  
     double rad = Math.asin(s);
     double ang = Math.toDegrees(rad);
     System.out.println("Angle of sine "+s+" is "+ang);
  }
}