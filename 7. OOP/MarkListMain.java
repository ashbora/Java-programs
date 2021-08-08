import java.util.Scanner;
class MarkList
{
  int roll;
  String name;
  int marks[],total;
  float percent;
 
  void inputData()
  {
    Scanner kbin = new Scanner(System.in);
    System.out.print("Enter roll number :");
    roll = kbin.nextInt();
    System.out.print("Enter Name of student :");
    name = kbin.next();
    marks = new int[5];
    System.out.print("Enter obtained marks in 5 subjects :");
    for(int i=0;i<5;i++)
      marks[i] = kbin.nextInt();
  }
  void process()
  {
    total = 0;
    for(int i=0;i<5;i++)
      total+= marks[i];
     percent = (float)total/5;
  }
  void output()
  {
     System.out.println("Roll number    :"+roll);
     System.out.println("Student name   :"+name);
     System.out.println("Marks obtained ");
     for(int i=0;i<5;i++)
       System.out.println("Subject "+(i+1)+"      :"+marks[i]);   
     System.out.println("Total marks    :"+total);
     System.out.println("Percentage     :"+percent); 
  }
}
class MarkListMain
{
   public static void main(String [] args)
   {
      MarkList marklist = new MarkList();
      marklist.inputData();
      marklist.process();
      marklist.output();
   }
}