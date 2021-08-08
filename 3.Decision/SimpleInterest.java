 class SimpleInterest
 {
   public static void main(String [] args)
   {
      double P,N,R,Si;
      P = Double.parseDouble(args[0]);
      N = Double.parseDouble(args[1]);
      if(N<1)
        R=3.25;
      else if(N<3)
        R=4.0;
      else if(N<5)
        R=4.60;
      else if(N<8)
        R=5.10;
      else
        R=6.0;
     
      Si=P*N*R/100;
      System.out.println("Simple interest is Rs."+Si);
   }
 }