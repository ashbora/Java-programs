class Student
{
  String name;
  int roll;
  void setData(String name,int roll)
  {
     this.name = name;
     this.roll = roll;
  }

  void display()
  {
     System.out.println("Name         :"+name);
     System.out.println("Roll number  :"+roll);
  }
}
class Exam extends Student
{
   int [] marks;
   void setData(int [] marks)
   {
     this.marks = marks;
   }
   void display()
   {  super.display();    //invokes super class(Student)method display()
      for(int i=0;i<marks.length;i++)
         System.out.println("Subject "+(i+1)+"    :"+marks[i]);   
   }
}
class Result extends Exam
{
   int total;
   float percent;
   void process()
   {
      total=0;
      for(int i=0;i<marks.length;i++)
          total+=marks[i];

      percent = (float)total/marks.length;
   }
   void display()
   {  super.display();   //invokes super class(Exam) method display();
      System.out.println("Total marks  :"+total);
      System.out.println("Percentage   :"+percent);
   } 
}
class Inh3
{
   public static void main(String [] args)
   {
       String name = "Aniket Tamgadge";
       int roll= 7;
       int marks[] = {50,60,78,69,95};    
       Result res = new Result();
       res.setData(name,roll);
       res.setData(marks);
       res.process();
       res.display();
   }
}