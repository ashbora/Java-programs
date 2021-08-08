class EvenNumbers extends Thread
{
   int limit;
   EvenNumbers(int limit)
   {
      this.limit= limit;
      start();
   }
  public void run()
   {
     for(int i=2;i<=limit;i+=2)
     {
        System.out.println("Even Value :"+i);
        try
        {
          Thread.sleep(30);
        }catch(InterruptedException e){}
     }
   }
}
class PrimeValues extends Thread
{
  int limit;
  PrimeValues(int limit)
  {
     this.limit = limit;
     start();
  }
  public void run()
  {
     for(int num=1;num<=limit;num++)
     {
       boolean isprime=true;
       for(int d=2;d<=Math.sqrt(num);d++)
       {
          if(num%d==0)
          {
             isprime=false;
             break;
          }
       }
       if(isprime)
         System.out.println("Prime value :"+num); 
       try
        {
           Thread.sleep(10);
        }catch(InterruptedException e){}
     } 
  }
}
class MyThread4
{
  public static void main(String [] args)
  {
     System.out.println("Main thread started....");
     new PrimeValues(1000); 
     new EvenNumbers(500);
     System.out.println("Main thread ended....");
  }
}