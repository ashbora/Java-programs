  class Leap1
  {
    public static void main(String [] args)
    {
      int yr = Integer.parseInt(args[0]);
      if(yr%400 == 0 || yr%100!=0 && yr%4==0)
          System.out.println("Year is leap");
      else
          System.out.println("Year is not leap");
     
    }
  }