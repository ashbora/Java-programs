class Bitwise3
{
   public static void main(String [] args)
   {
      int a = Integer.parseInt(args[0]);
      int b = a >> 1;
      int c = a >> 2;
      int d = a >> 3;
      System.out.println(a+">> 1 = "+b);
      System.out.println(a+">> 2 = "+c);
      System.out.println(a+">> 3 = "+d);
   }
}