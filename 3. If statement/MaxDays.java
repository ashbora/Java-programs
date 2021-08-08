import java.util.Scanner;
class MaxDays
{
  public static void main(String [] args)
  {
     Scanner kb = new Scanner(System.in);
     int m;
     System.out.print("Enter the month number :");
     m = kb.nextInt();
     if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
        System.out.println("Max. days are 31");
     else if(m==4 || m==6 || m==9 || m==11)
        System.out.println("Max. days are 30");
     else if(m==2)
        System.out.println("Max.days are 28 or 29");
     else
        System.out.println("Invalid month number"); 
  }
}