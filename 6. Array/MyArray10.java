import java.util.Arrays;
class MyArray10
{
  public static void main(String [] args)
  {
     int [] a = {12,18,23,26,28,31,35,40,50,55};
     int [] b = {12,18,26,23,28,31,35,40,50,55};
   
     if(Arrays.equals(a,b))
        System.out.print("Arrays are identical");
     else
        System.out.print("Arrays are not identical");

  }
}