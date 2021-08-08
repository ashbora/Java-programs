class MyArray7
{
  public static void main(String [] args)
  {
     int [] a = {43,56,12,77,89,43,82,94,53,17};
     int [] b = new int[10];
     System.arraycopy(a,0,b,0,a.length);

     System.out.print("First array :");
     for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");

     System.out.print("\nSecond array :");
     for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");    
  }
}