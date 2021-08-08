import java.util.Scanner;
class Season
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int m;
    System.out.print("Enter the month number(1-12):");
    m = sc.nextInt();
    switch(m)
    {
      case 3  :
      case 4  :
      case 5  : System.out.println("Season : Summer");
                break;
      case 6  :
      case 7  :
      case 8  : System.out.println("Season : Mansoon");
                break;
      case 9  :
      case 10 :
      case 11 : System.out.println("Season : Post-Mansoon");
                break;
      case 12 :
      case 1  :
      case 2  : System.out.println("Season : Winter");
                break;
      
      default: System.out.println("Invalid month number"); 
    } 
  }
}