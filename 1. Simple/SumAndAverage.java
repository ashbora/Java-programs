class SumAndAverage
{
  public static void main(String [] args)
  {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);
    int n4 = Integer.parseInt(args[3]);
    int sum = n1+n2+n3+n4;
    float avg = (float)sum/4;        // sum/4.0f;
    System.out.println("The sum is "+sum);
    System.out.println("The average is "+avg);
  }
}