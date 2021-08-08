class DemoThread implements Runnable 
{
   Thread t;
   DemoThread()
   {  
      t = new Thread(this);
      System.out.println("Demo thread started...");
      t.start();    
   }
 
   public void run()
   {
     for(int j=1;j<=30;j++)
     {
        System.out.println("Demo thread :"+j);
        try
        {
          Thread.sleep(500);
        }catch(InterruptedException e)
        {}
     } 
     System.out.println("Exiting Demo thread"); 
   } 
}
class MyThread3
{
  public static void main(String [] args)
  {
     System.out.println("Main thread started....");
     DemoThread t = new DemoThread(); 
     for(int i=1;i<=20;i++)
     {  
        System.out.println("Main Thread :"+ i);
        try
        {
          Thread.sleep(1000);
        }catch(InterruptedException e)
        { }
     }
     System.out.println("Main thread ended....");
  }
}