/*
 static int max(int x,int y)
 static long max(long x, long y)
 static float max(float x,float y)
 static double max(double x,double y)

 static int min(int x,int y)
 static long min(long x, long y)
 static float min(float x,float y)
 static double min(double x,double y)
*/
class MyMath7
{
  public static void main(String [] args)
  {
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[1]);
     System.out.println("Max value "+ Math.max(a,b));
     System.out.println("Min value "+ Math.min(a,b));
  } 
}