  class Largest4
  {
    public static void main(String [] args)
    {
      int a,b,c;
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      c = Integer.parseInt(args[2]);
      int large = a;
      if(b > large)
        large = b;
    
      if(c > large)
        large = c;

      System.out.println("Largest number is "+large);
    }
  }