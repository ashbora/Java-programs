 class Check1
 {
   public static void main(String [] args)
   {
     int x = Integer.parseInt(args[0]);
     int y = Integer.parseInt(args[1]);
     if(x> Math.pow(y,2))
          System.out.println("Value of x is greater than the square of y");
     else
          System.out.println("Value of x is not greater than the square of y");
   }
 }