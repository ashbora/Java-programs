class DemoThread implements Runnable
{
  Thread t;
  DemoThread(String name)
  {
     t = new Thread(this);
     t.setName(name);
     t.start();
  }
  public void run()
  {
     System.out.println(t.getName()+" started");
     for(int i=1;i<=100;i++)
     {
        System.out.println(t.getName()+":"+i);
        try
        {
          Thread.sleep(20);
        }catch(InterruptedException e){} 
     }
     System.out.println(t.getName()+" exited");   
  }
}

class MyThread5
{
  public static void main(String [] args)
  {
     new DemoThread("TestDemo");
    
  }
}