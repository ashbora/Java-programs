/*
 static float ceil(float arg)
 static double ceil(double arg)

 static float floor(float arg)
 static double floor(double arg)
*/
class MyMath8
{
  public static void main(String [] args)
  {
     float a=Float.parseFloat(args[0]);
     System.out.println("Ceil value "+ Math.ceil(a));
     System.out.println("Floor value "+ Math.floor(a));
  } 
}