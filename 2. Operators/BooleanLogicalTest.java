class BooleanLogicalTest
{
  public static void main(String [] args)
  {
    int a = 10, b = 9, c=12;
    if(a<b && ++a<c)             //if(a<b & ++a<c)
       System.out.println("True side");
    else
       System.out.println("False side");

    System.out.println("Value of a :"+a);
  }
}