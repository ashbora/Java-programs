 class OddNumberSum
 {
   public static void main(String [] args)
   {
     int odd=1,oddsum=0;
     for(int c=1;c<=100;c++)
     { 
        oddsum+=odd;
        odd+=2;     
     }
     System.out.println("Sum of first 100 odd numbers :"+oddsum);
   }
 }
