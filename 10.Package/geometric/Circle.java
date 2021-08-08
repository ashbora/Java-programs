package geometric;
public class Circle
{
  private double rad;

  public void setRadius(double rad)
  { this.rad = rad; }
  
  public double area()
  {
    double a= Math.PI*rad*rad;
    return a; 
  }

  public double circumference()
  {
    double c= 2*Math.PI*rad;
    return c; 
  }
}