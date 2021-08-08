 import java.util.*;
 class Array11
 {
    public static void main(String [] args)
    {
       int [] a ={54,23,77,10,67,32,82,13,7};
       Arrays.sort(a);
       for(int i=0;i<a.length;i++)
         System.out.print(a[i]+" ");
    }
 }

/*
  int k = Arrays.binarySearch(a,10);
  int [] b = Arrays.copyOf(a,a.length);
  if(Array.equals(a,b))
  Arrays.fill(a,23);
  Arrays.fill(a,2,7,23);
*/