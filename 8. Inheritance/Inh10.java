class Person
{
   String name;
   int age;
   Person(String name,int age)
   {
     this.name = name;
     this.age  = age;
   }
   void display() 
   {
      System.out.println("Name   :"+name);
      System.out.println("Age    :"+age); 
   }     
}
class Student extends Person
{
   String branch;
   int semester;
   Student(String name, int age,String branch,int semester)
   {
     super(name,age);
     this.branch = branch;
     this.semester = semester;  
   }
   void display()
   {
      super.display();
      System.out.println("Branch   :"+branch);
      System.out.println("Semester :"+semester);
   } 
}
class Staff extends Person
{
  String deptt,desg;
  Staff(String name,int age,String deptt,String desg)
  {
     super(name,age);
     this.deptt = deptt;
     this.desg  = desg;
  }
  void display()
  {
     super.display();
     System.out.println("Department   :"+deptt);
     System.out.println("Designation  :"+desg);
  }
}
class Inh10
{
  public static void main(String [] args)
  {
      Student stud = new Student("Rakhi Anantwar",20,"CO",6);
      Staff staff = new Staff("Sadique Fanan",30,"EXTC","Asst.Professor");
      Person per;
      per = stud;
      per.display();
      per = staff;
      per.display();
  }
}