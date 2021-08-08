 class Array5
 {
    public static void main(String [] args)
    {
      int [] maxdays = {31,28,31,30,31,30,31,31,30,31,30,31};
      int m = Integer.parseInt(args[0]);
      if(m>=1 && m<=12)
        System.out.println("Max days are "+ maxdays[m-1]);
      else
        System.out.println("Invalid month number");
    }
 }