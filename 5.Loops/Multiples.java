/* program to print 10 multiples
   of given number
 */
class Multiples
{
  public static void main(String [] args)
  {
      int num = Integer.parseInt(args[0]);
      for(int m=1;m<=10;m++)
      {
         int p = num*m;
         System.out.println(p);
      }
  }
}