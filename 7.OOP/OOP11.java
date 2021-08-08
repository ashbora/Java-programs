 /* avoid naming collision - use of this */
  class Student
  {
     String name;
     int roll;
     int [] marks;
     int total;
     float percent;
     Student(String name,int roll,int []marks)
     {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
     }
    void process()
    {
      total=0;
      for(int m:marks)
        total+=m;
      percent = total/5.0f;
    }
   void display()
   {
       System.out.println("Roll number   :"+roll);
       System.out.println("Name          :"+name);
       System.out.println("Obtained marks\n-------------------");
       for(int i=0;i<marks.length;i++)
          System.out.println("Subject "+(i+1)+"     :"+marks[i]);
       System.out.println("------------------");
       System.out.println("Total         :"+total);
       System.out.println("Percentage    :"+percent);   
   }
  } 
  class OOP11
  {
    public static void main(String [] args)
    {
        String name="Sundip Lohkare";
        int roll = 425;
        int []marks ={76,88,56,69,76};
         
        Student student = new Student(name,roll,marks);
        student.process();
        student.display();
    }
  } 