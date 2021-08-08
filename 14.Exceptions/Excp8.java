import java.util.Scanner;
class InvalidMarksException extends Exception
{
   int mrk;
   InvalidMarksException(int m)
   { mrk = m; }

   public String toString()
  { return "Marks out of range "+mrk; }
}

class Excp8
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     int m1;
     System.out.print("Enter marks :");
     m1 = sc.nextInt();
     try
     {
        checkMarks(m1);
        System.out.println("Normal marks");
     }catch(InvalidMarksException e)
     {
        System.out.print(e);
     }
  }
  static void checkMarks(int m1) throws InvalidMarksException
  {
     if(m1<0 || m1>100)
       throw new InvalidMarksException(m1);
  }
}