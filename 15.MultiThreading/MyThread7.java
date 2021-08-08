class DemoThread extends Thread
{ 
  DemoThread(String name)
  {  super(name);    
     //setName(name);
     start();
  }
  public void run()
  {
     System.out.println(getName()+" started");
     for(int i=1;i<=20;i++)
     {
        System.out.println(getName()+":"+i);
        try
        {
          Thread.sleep(100);
        }catch(InterruptedException e){} 
     }
     System.out.println(getName()+" exited");   
  }
}

class MyThread7
{
  public static void main(String [] args)
  {   
     System.out.println("Main thread started"); 
     DemoThread t1 = new DemoThread("Test1");
     DemoThread t2 = new DemoThread("Test2");
     System.out.println("Thread 1 alive :"+ t1.isAlive());
     System.out.println("Thread 2 alive :"+ t2.isAlive());
     try
     {
       t1.join();
       t2.join(); 
      }catch(InterruptedException e){}
     System.out.println("Thread 1 alive :"+ t1.isAlive());
     System.out.println("Thread 2 alive :"+ t2.isAlive());
     System.out.println("Main thread ended");
  }
}