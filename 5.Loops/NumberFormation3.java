 /*
  number formation
  if n=5 then output will be
          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
 */
 class NumberFormation3
 {
   public static void main(String [] args)
   {
      int n = Integer.parseInt(args[0]);
      for(int i=1;i<=n;i++)
      {
        for(int s = 1;s<=n-i;s++)
           System.out.print("  ");
        for(int j=1;j<=i;j++)
          System.out.print(j%10+" ");
        for(int j=i-1;j>=1;j--)
          System.out.print(j%10+" ");

        System.out.println();
      } 
   }
 }