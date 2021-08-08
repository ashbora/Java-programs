import java.util.Arrays;
class MyArray12
{
  public static void main(String [] args)
  {
     int [] a = new int[]{54,23,5,77,354,28,18,77,29,49};
     int [] b = Arrays.copyOf(a,a.length);  

     System.out.print("First array :");
     for(int x:a)
        System.out.print(x+" ");  
 
     System.out.print("\nSecond array :");
     for(int x:b)
        System.out.print(x+" ");  
  }
}