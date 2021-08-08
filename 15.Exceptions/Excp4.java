 class Excp4
 {
    public static void main(String [] args)
    {
       System.out.println("Program starts...");
       int a,b,c=0;
       try
       { 
            a= Integer.parseInt(args[0]);
            b= Integer.parseInt(args[1]);
            c = a / b;
       }catch(ArrayIndexOutOfBoundsException excp)
       {
          System.out.println("Required values not provided.");
          c=0;
       }
        catch(NumberFormatException excp)
       {
          System.out.println("Invalid numeric value provided.");
          c=0;
       }
       catch(ArithmeticException excp)
       {
          System.out.println("Divisor should not be zero.");
          c=0;
       }
       finally
       {
            System.out.println("Division is "+c);
        }
       System.out.println("Program ends...");
    }
 }