 class Excp8
 {
    public static void main(String [] args)
    {
       System.out.println("Program starts...");
       try
       {
            System.out.println("Inside First try block");
            try 
             {
                  System.out.println("Inside Second try block");
                  throw new ArrayStoreException("My Test exception");
              }
              finally
              {
                 System.out.println("Exiting Second try block");
               }

       }catch(Exception excp)
       {
         System.out.println("Error : "+excp.getMessage());
       }
        finally
        {
             System.out.println("Exiting First try block");
        }
       System.out.println("Program ends...");
    }   
 }