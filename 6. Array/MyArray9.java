import java.util.Arrays;
class MyArray9
{
  public static void main(String [] args)
  {
     int [] a = {12,18,23,26,28,31,35,40,50,55};
     int val = 54;
     int p = Arrays.binarySearch(a,val);
     
     if(p>=0)
        System.out.print(val+" is present at location "+p);
     else
        System.out.print(val+" is not present in the array");

  }
}