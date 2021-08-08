 import java.util.Scanner;
 class VowelConsonent
 {
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any alphabet :");
    char c = sc.next().charAt(0);                            
    if(c>='A' && c<='Z' || c>='a' && c<='z')  // if(c>=65 && c<=90 || c>=97 && c<=122)  
      switch(c)
      {
         case 'A' :
         case 'E' :
         case 'I' :
         case 'O' :
         case 'U' :
         case 'a' :
         case 'e' :
         case 'i' :
         case 'o' :
         case 'u' : System.out.println("Vowel");
                    break;
         default  : System.out.println("Consonent");
                    break;
      }
    else
       System.out.println("Not an alphabet entered");
  }
}