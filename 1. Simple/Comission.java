import java.util.Scanner;
class Comission
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rate of product sold :");
    float rate = sc.nextFloat();
    System.out.print("Enter the quantity :");
    int qty = sc.nextInt();
    float amt = rate * qty;
    float com = amt * 2.5f/100;
    System.out.println("Amount of product :"+amt);
    System.out.println("Comission of salesman :"+com);
  }
}