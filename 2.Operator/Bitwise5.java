class Bitwise5
{
  public static void main(String []args)
  {
     int x = 78;
     int p = x>>1;
     int q = x>>2;
     int r = x>>>1;
     int s = x<<1;
     int t = x<<2;
     System.out.println(x+">>1 = "+p);
     System.out.println(x+">>2 = "+q);
     System.out.println(x+">>>1 = "+r);
     System.out.println(x+"<<1 = "+s);
     System.out.println(x+"<<2 = "+t);
  }
}