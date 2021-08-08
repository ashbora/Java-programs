class Number
{
  public static void main(String [] args)
  {
    int num = Integer.parseInt(args[0]);
    int sq = num*num;
    int cb = sq * num;
    double sr,cr;
    sr = Math.sqrt(num);
    cr = Math.cbrt(num);
    System.out.println("Square      :"+sq);
    System.out.println("Cube        :"+cb);
    System.out.println("Square root :"+sr);
    System.out.println("Cube root   :"+cr);
  }
}