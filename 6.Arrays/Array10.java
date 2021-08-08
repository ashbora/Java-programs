 class Array10
 {
    public static void main(String [] args)
    {
       int a[]={54,44,56,20,55,10,92,70,49,29};
       int []b=new int[10];
       int i;
       System.arraycopy(a,0,b,0,a.length);
       //first array output
       System.out.print("First array  :");
       for(i=0;i<a.length;i++)
          System.out.print(a[i]+" ");
       System.out.println();
       System.out.print("Second array :");
       for(i=0;i<a.length;i++)
          System.out.print(b[i]+" ");
    }
 }