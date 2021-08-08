 /*
  number formation
  if n=5 then output will be
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
 */
 class NumberFormation1
 {
   public static void main(String [] args)
   {
      int n = Integer.parseInt(args[0]);
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
          System.out.printf("%c ",(j+64));

        System.out.println();
      } 
   }
 }