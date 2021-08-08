  /* returning the invoking object - use of this */
  class Person
  {
     String name;
     int age;
   
     Person(String name,int age)
     {
         this.name = name;
         this.age = age;
     }
     void display()
     {
       System.out.println("Name   :"+name+"\tAge  :"+age);
     }
     
     Person younger(Person t)
     {
        if(t.age < age)
           return t;
        else
           return this;
     }
  }
  class OOP12
  {
     public static void main(String [] args)
     {
        Person p1,p2;
        p1 = new Person("Amir",47);
        p2 = new Person("Salman",48);
        Person young = p1.younger(p2);
        System.out.println("Younger person is ");
        young.display();        
     } 
  }