 class Excp5
 {
    public static void main(String [] args)
    {
       System.out.println("Program starts...");
       try
       {
           String pass = args[0];
           if( ! pass.equals("abcd"))
                  throw  new SecurityException("Wrong password");             
           System.out.println("You entered the correct password");
           System.out.println("You are the authorised user");         
       }catch(SecurityException excp)
       {
           System.out.println("You are not authorised to use this program :"+excp.getMessage());
       }
       System.out.println("Program ends...");
    }
 }