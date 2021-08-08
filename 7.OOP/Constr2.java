 class Person
 {
    String name;
    int age;
    Person(String nm,int a)     //paramterized constructor
    {
      name = nm;
      age = a;
    }
    void display()
    {
      System.out.println("Name  :"+name+"\t\tAge  : "+age);
    }
 }
 class Constr2
 {
    public static void main(String [] args)
    {
      Person p1,p2,p3;
      p1 = new Person("Saurabh",18);
      p2 = new Person("Shreyash",15);
      p3 = new Person("Tanmay",12); 
      p1.display();
      p2.display();
      p3.display();
    }
 }