import java.util.Scanner;
class BMI
{
 public static void main(String [] args)
 {
   Scanner sc = new Scanner(System.in);
   double wt,ht;
   System.out.print("Enter the weight of person in kg :");
   wt = sc.nextDouble();
   System.out.print("Enter the height of person in meters :");
   ht = sc.nextDouble();
   double bmi = wt/(ht*ht);
   System.out.println("Body Mass Index is "+bmi);
 }
}