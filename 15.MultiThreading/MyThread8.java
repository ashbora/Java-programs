class DemoThread extends Thread
{ 
  long num;
  boolean canrun;
  DemoThread(String name,int priority)
  {  super(name);
     setPriority(priority); 
     canrun=true;        
     num=0;
     start();
  }
  public void run()
  {
    System.out.println("Thread :"+getName()+" started");
    while(canrun)
     {
         num++;
        System.out.println(num);
     }
  }

  public void finish()
  {
      canrun=false;
  }
  public void display()
  {
    System.out.println("Thread :"+getName()+"\tValue :"+num);   
  }
}

class MyThread8
{
  public static void main(String [] args)
  {   
     DemoThread t1 = new DemoThread("First",Thread.NORM_PRIORITY-3);
     DemoThread t2 = new DemoThread("Second",Thread.NORM_PRIORITY+3);
     try
     {
       Thread.sleep(500);
      }catch(InterruptedException e){}
     
     t1.finish(); 
     t2.finish();
     try
     {
        t1.join();
        t2.join();
     }catch(InterruptedException e){}
     t1.display();
     t2.display();
  }
}