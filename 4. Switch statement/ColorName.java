import java.util.Scanner;
class ColorName 
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    char c;
    System.out.print("Enter any alphabet :");
    c = sc.next().charAt(0);                            
    if(c>='A' && c<='Z' || c>='a' && c<='z')  // if(c>=65 && c<=90 || c>=97 && c<=122)  
    switch(c)
      {
         case 'R' :
         case 'r' : System.out.println("Red");
                    break;
         case 'G' :
         case 'g' : System.out.println("Green");
                    break;
         case 'B' :
         case 'b' : System.out.println("Blue");
                    break;
         default  : System.out.println("Black");
                    break;
      }
    else
       System.out.println("Error");
  }
}