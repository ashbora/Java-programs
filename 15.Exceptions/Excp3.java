 class Excp3
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
       }catch(ArrayIndexOutOfBoundsException excp)
       {
          System.out.println("Required values not provided.");
       }
        catch(NumberFormatException excp)
       {
          System.out.println("Invalid numeric value provided.");
       }
       catch(ArithmeticException excp)
       {
          System.out.println("Divisor should not be zero.");
       }
       System.out.println("Program ends...");
    }
 }