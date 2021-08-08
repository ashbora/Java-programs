/*
static double pow(double x,double y)
*/
class MyMath5
{
  public static void main(String [] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double p = Math.pow(x,y);
    System.out.println(x+" raised to the power "+y+" is "+p);
  }
}