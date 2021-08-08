 class ConvCToF
 {
    public static void main(String [] args)
    {
       float C = Float.parseFloat(args[0]);
       float F = 1.8f * C + 32;
       System.out.println("Temp.in degree Fahrenheit :"+F);
    }
 }