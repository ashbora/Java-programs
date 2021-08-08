   interface Banking
  {
       void createAccount(String name ,int acno,String type,double balance);
       void deposit(double amt);
       void withdrawl(double amt);
       void display();
  }  
  class BankAC implements Banking
  {
     int acno;
     String name;
     String type;
     double balance;
     public void createAccount(String name,int acno, String type,double balance)
    { 
       this.name = name;
       this.acno = acno;
       this.type = type;
       this.balance = balance;
    }
     public void deposit(double amt)
    { balance+=amt; }
     public void withdrawl(double amt)
    { balance-=amt; }
    public void display()
   {
      System.out.println("Ac Number :"+acno); 
      System.out.println("Name      :"+name);
      System.out.println("Type      :"+type);
      System.out.println("Balance   :"+balance);
   }
  }
  class InterfaceDemo1
  {
     public static void main(String [] args)
     {
        BankAC b = new BankAC();
        b.createAccount("My Name",5345,"Savings",12000);
        b.display();
        b.deposit(15000);
        b.display();
        b.withdrawl(16000);
        b.display();
     }
  }