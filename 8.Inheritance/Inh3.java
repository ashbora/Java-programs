 class Student
 {
    String name;
    int roll;
    void setData(String nm,int rl)
    {
      roll=rl;
      name=nm;
    }
    void putData()
    {
      System.out.println("Roll number     :"+roll);
      System.out.println("Name            :"+name);
    }
 }
 class Exam extends Student
 {
    int [] marks;
    void setData(String nm,int rl,int [] m)
    {  
        setData(nm,rl);
        marks = m;
    }
    void putMarks()
    {
       putData();
       for(int i=0;i<marks.length;i++)
          System.out.println("Subject "+(i+1)+"       :"+marks[i]);
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
   void putResult()
   {
     putMarks();
     System.out.println("Total marks     :"+total);
     System.out.println("Percentage      :"+percent); 
   }
 }
 class Inh3
  {
    public static void main(String [] args)
    {
        Result r = new Result();
        int [] marks = {67,58,96,75,89,50};
        r.setData("Ankit Jadhao",1234,marks);
        r.process();
        r.putResult();
    }
  }
