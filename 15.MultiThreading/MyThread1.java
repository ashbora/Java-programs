class MyThread1
{
  public static void main(String [] args)
  {
     System.out.println("Main thread started....");
     for(int i=1;i<=20;i++)
     {  
        System.out.println(i);
        try
        {
          Thread.sleep(1000);
        }catch(InterruptedException e)
        { }
     }
     System.out.println("Main thread ended....");
  }
}