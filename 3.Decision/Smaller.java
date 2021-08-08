 class Smaller
 {
    public static void main(String [] args)
    {
       int n1,n2;
       n1 = Integer.parseInt(args[0]);
       n2 = Integer.parseInt(args[1]);
       if(n1 < n2)
          System.out.println("Smaller number is "+n1);
       else
          System.out.println("Smaller number is "+n2);
    }
 }