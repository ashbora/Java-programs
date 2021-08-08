class Numbers
{
   int n1,n2;
   Numbers(int n1,int n2)   //parameterized constructor
   {
      this.n1 = n1;
      this.n2 = n2;
   }
   void display()
   {
      System.out.println("First number :"+n1+"\tSecond number :"+n2);
   } 
}

class Constructor2
{
  public static void main(String [] args)
  {
     Numbers obj = new Numbers(10,45);
     obj.display();
  }  
}