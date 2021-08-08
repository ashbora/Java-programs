import java.util.Scanner;
class JanuaryOne
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      int year;
      System.out.print("Enter the year :");
      year = kb.nextInt();
      int prev_year = year-1;
      int tnd = prev_year * 365;
      int tld = prev_year/4 - prev_year/100 + prev_year/400;
      int td = tnd + tld;
      int d = td % 7 + 1;
      String msg = "Day on Jan.1 "+year+" : ";
      if(d==1)
       msg = msg + "Monday";
      else  if(d==2)
       msg = msg + "Tuesday";
      else  if(d==3)
       msg = msg + "Wednesday";
      else  if(d==4)
       msg = msg + "Thursday";
      else  if(d==5)
       msg = msg + "Friday";
      else  if(d==6)
       msg = msg + "Saturday";
      else 
       msg = msg + "Sunday";
 
       System.out.println(msg);   
   }
}