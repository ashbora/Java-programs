class Cylinder extends geometric.Circle
{
  double ht;
  void setHeight(double ht)
  { this.ht = ht; }

  double volume()
  {
    double v = area()*ht;
    return v;
  }
  
  double surfaceArea()
  {  
     double sa = circumference()*ht;
     return sa;
  }
}