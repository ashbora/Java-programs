class Printer
{
  synchronized void print(String msg)
   {
     for(int i=0;i<msg.length();i++)
     { 
       System.out.print(msg.charAt(i));        
       try
       {
          Thread.sleep(50);        
       }catch(InterruptedException e)
        {}
     }
     System.out.println();
   }
  }
class DemoThread extends Thread
{ 
   Printer printer;
   String msg;
   DemoThread(String msg,Printer printer)
   {  
      this.msg = msg;
      this.printer = printer;
      start();
   }
  public void run()
  {
        printer.print(msg);
  }
}

class MyThread10
{
  public static void main(String [] args)
  {
      Printer printer = new Printer();
      DemoThread t1 = new DemoThread("It becomes very hectic if we study all subjects at a time",printer);   
      DemoThread t2 = new DemoThread("We have not time at all for other works,but still we are not confident in our works",printer);
      DemoThread t3 = new DemoThread("We want all luxuries at the cost of nothing,hardwork is not possible",printer);
  }
}