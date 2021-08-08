/*
 static int abs(int arg)
 static long abs(long arg)
 static float abs(float arg)
 static double abs(double arg)
*/
class MyMath6
{
  public static void main(String [] args)
  {
     int a=-89;
     long b = 88373;
     float c = -94.78f;
     double d = 988.355;
     System.out.println("Absolute value of "+a+" is "+ Math.abs(a));
     System.out.println("Absolute value of "+b+" is "+ Math.abs(b));
     System.out.println("Absolute value of "+c+" is "+ Math.abs(c));
     System.out.println("Absolute value of "+d+" is "+ Math.abs(d));
  } 
}