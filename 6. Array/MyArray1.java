class MyArray1
{
   public static void main(String [] args)
   {
       int [] a;          //array declaration
       a = new int[5];  //array creation
    
       a[0] = 78;
       a[1] = 83;
       a[2] = 90;
       a[3] = 80;
       a[4] = 79;
      
      System.out.println("Array values are"); 
      for(int i=0;i<5;i++)
        System.out.print(a[i]+" ");   
   }  
}
   