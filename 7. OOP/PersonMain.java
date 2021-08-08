import java.util.Scanner;
class Person
{
  String name;
  int age;
  float weight,height;

  void inputData()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of person :");
    name = sc.next();
    System.out.print("Enter the age :");
    age = sc.nextInt();
    System.out.print("Enter the weight :");
    weight = sc.nextFloat();
    System.out.print("Enter the height :");
    height = sc.nextFloat();
  }
  void BMI()
  {
     float bmi = weight/(height*height);
     System.out.println("Body Mass Index :"+bmi); 
  }
  void outputData()
  {
     System.out.println("Name            :"+name);
     System.out.println("Age             :"+age);
     System.out.println("Weight          :"+weight);
     System.out.println("Height          :"+height);
  }
}
class PersonMain
{
  public static void main(String [] args)
  {
     Person p;          
     p = new Person();
     p.inputData();
     p.outputData();
     p.BMI();
  }
}