class MyArray6
{
   public static void main(String [] args)
   {
      int [] a = new int[]{54,334,77,29,74}; 
      int [] b = new int[5];
 
      //array copy
       b = a;
      //array output 
      System.out.print("First Array  : "); 
      for(int x:a)
        System.out.print(x+" ");   

      System.out.print("\nSecond Array : "); 
      for(int x:b)
        System.out.print(x+" ");   

   }  
}   