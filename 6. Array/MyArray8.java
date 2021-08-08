import java.util.Arrays;
class MyArray8
{
  public static void main(String [] args)
  {
     int [] a = {43,56,12,77,89,41,82,94,53,17};

     Arrays.sort(a);     
     System.out.print("Sorted array:");
     for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");

  }
}