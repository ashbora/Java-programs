import java.util.Scanner;
class BMI
{
  public static void main(String [] args)
  {
     Scanner kb = new Scanner(System.in);
     float wt,ht;
     System.out.print("Enter the weight of person in Kg:");
     wt = kb.nextFloat();
     System.out.print("Enter the height of person in meters :");
     ht = kb.nextFloat();
     String gender;
     System.out.print("Enter the gender of person :");
     gender = kb.next();
     float bmi = wt/(ht*ht);
     System.out.println("BMI : "+bmi);
     int bmistart=0;
     if(gender.equalsIgnoreCase("male"))
       bmistart = 20;
     else if(gender.equalsIgnoreCase("female"))
       bmistart = 18;
     else 
     {
         System.out.println("Error in data");
         System.exit(0);
     }
     if(bmi < bmistart)
       System.out.println("Status : Underweight");
     else
      if(bmi>bmistart+5) 
        System.out.println("Status : Overweight");
      else
        System.out.println("Status : Normal");    
  }
}