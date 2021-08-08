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
class PersonMain1
{
  public static void main(String [] args)
  {
     Person p1,p2,p3;          
     p1 = new Person();
     p2 = new Person();
     p3 = new Person();
     p1.inputData();
     p2.inputData();
     p3.inputData();
     p1.outputData();
     p1.BMI();
     p2.outputData();
     p2.BMI();
     p3.outputData();
     p3.BMI();
  }
}