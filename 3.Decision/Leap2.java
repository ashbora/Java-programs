  class Leap2
  {
    public static void main(String [] args)
    {
      int yr = Integer.parseInt(args[0]);
      int d;
      if(yr%100==0)
         d=400;
      else
         d=4;

      if(yr%d==0)
          System.out.println("Year is leap");
      else
          System.out.println("Year is not leap");
     
    }
  }