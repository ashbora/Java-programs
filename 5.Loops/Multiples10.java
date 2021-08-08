/* to print 10 multiples of each number 
   from 1 to 10
*/
class Multiples10
{
  public static void main(String [] args)
  {
    for(int num=1;num<=10;num++)
    { for(int m=1;m<=10;m++)
        System.out.print(num*m+"\t");
      System.out.println();
    }
  }
}