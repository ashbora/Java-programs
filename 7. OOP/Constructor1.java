class Person
{
   String name,city;
   Person()              //default constructor
   {
       name="";
       city="Yavatmal";
   }
   void display()
   {
      System.out.println("Name :"+name);
      System.out.println("City :"+city);
   }   
}
class Constructor1
{
  public static void main(String [] args)
  {
      Person p = new Person();
      p.display();
  }
}