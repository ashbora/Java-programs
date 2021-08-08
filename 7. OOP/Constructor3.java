class NumericValues
{
  int num1,num2,num3;
  NumericValues()   //default constructor
  {
    num1=num2=num3=1;
  }
  NumericValues(int val) //parameterized constructor- with 1 parameter
  {
    num1=num2=num3=val;
  }  
  NumericValues(int v1,int v2,int v3)//parameterized constructor- with 3 parameters
  {
     num1=v1; num2=v2;num3=v3;
  }
  void show()
  {
     System.out.println("First value :"+num1+"\tSecond value  :"+num2+"\tThird value :"+num3);
  }
}
class Constructor3
{
  public static void main(String [] args)
  {
     NumericValues obj1,obj2,obj3;
     obj1 = new NumericValues();        //invokes default constructor
     obj2 = new NumericValues(39);      //invokes parameterized constructor with 1 parameter
     obj3 = new NumericValues(20,30,50); //invokes parameterized constructor with 3 parameters

     obj1.show();
     obj2.show();
     obj3.show();
  } 
}