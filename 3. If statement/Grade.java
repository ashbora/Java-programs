import java.util.Scanner;
class Grade
{
  public static void main(String [] args)
  {
     Scanner kb = new Scanner(System.in);
     int marks;
     System.out.print("Enter the obtained marks :");
     marks = kb.nextInt();
     if(marks<0 || marks>100)
       System.out.println("Invalid marks");
     else if(marks>=90)
       System.out.println("Grade : Outstanding");
     else if(marks>=80)
       System.out.println("Grade : Excellent");
     else if(marks>=70)
       System.out.println("Grade : Good");
     else if(marks>=60)
       System.out.println("Grade : Average");
     else if(marks>=50)
       System.out.println("Grade : Pass");
     else 
       System.out.println("Grade : Fail");          
  }
}