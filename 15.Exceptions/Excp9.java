 class Excp9
 {
    static void   demoException()
    {
       NullPointerException e = new NullPointerException("First exeption");
       e.initCause( new IllegalMonitorStateException("Thread operation error"));
       throw e; 
    }
    public static void main(String [] args)
    {
       System.out.println("Program starts...");
       try
       {
           demoException(); 
       }catch(Exception excp)
       {
         System.out.println("Error : "+excp.getMessage());
         System.out.println("Actual cause :"+excp.getCause());
       }
       System.out.println("Program ends...");
    }   
 }