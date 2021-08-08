class Sample
{
  int v1,v2;
  void setValues(int a,int b)
  {
     v1=a;
     v2=b;
  } 
  void show()
  {
    System.out.println("First value  :"+v1);
    System.out.println("Second value :"+v2);
  }
}
class ObjectReferencing
{
  public static void main(String [] args)
  {
    Sample s1 = new Sample();
    s1.setValues(10,20);

    Sample s2;
    s2=s1;

    s1.show();
    s2.show(); 
  }
}