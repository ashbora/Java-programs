 class Excp1
 {
    public static void main(String [] args)
    {
       System.out.println("Program starts...");
       int a,b,c;
       try
       { 
            a= Integer.parseInt(args[0]);
            b= Integer.parseInt(args[1]);
            c = a / b;
            System.out.println("Division is "+c);
       }catch(Exception excp)
       {
          System.out.println("Error in data");
       }
       System.out.println("Program ends...");
    }
 }