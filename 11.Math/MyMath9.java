/*
 static double rint(double arg)

 static int round(float arg)
 static long round(double arg)
*/
class MyMath9
{
  public static void main(String [] args)
  {
     float a=Float.parseFloat(args[0]);
     System.out.println("rint  :"+ Math.rint(a));
     System.out.println("round :"+ Math.round(a));
  } 
}