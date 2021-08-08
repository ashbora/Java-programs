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

class MyThread6
{
  public static void main(String [] args)
  {
     new DemoThread("Test1");
     new DemoThread("Test2");
     new DemoThread("Test3");
     new DemoThread("Test4");    
  }
}