class DemoThread extends Thread 
{
  boolean suspendflag; 
  DemoThread(String name)
  {
    super(name);
    suspendflag=false;
    start();
  }
  public void run()
  {
   try
   {
     for(int i=1;i<=100;i++)
     {
      System.out.println(getName()+":"+i);
      Thread.sleep(50);
      synchronized(this)
      { 
         while(suspendflag)
         {
           wait();
         } 
       }  
     }
    }catch(InterruptedException e)
    { System.out.println("Thread interrupted");}  
  }
  void suspendThread()
  { 
     suspendflag=true;
  }
  synchronized void resumeThread()
  {
    suspendflag=false;
    notify();
  }

}

class MyThread11
{
  public static void main(String [] args)
  {
     DemoThread t1 = new DemoThread("First");
     DemoThread t2 = new DemoThread("Second");
     try
     {
       t1.suspendThread();
       Thread.sleep(2000);
       t1.resumeThread();
       t2.suspendThread();
       Thread.sleep(2000);
       t2.resumeThread();
     }catch(InterruptedException e)
     {}
  }
}