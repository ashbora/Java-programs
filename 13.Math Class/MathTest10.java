 class MathTest10
 {
     public static void main(String [] args)
     {
        for(int i=1;i<=10;i++)
        { Double d = Math.random()*100;  
           int v = d.intValue();
           System.out.println("Random      :"+v);
         }
       }
 }