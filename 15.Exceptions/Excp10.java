 class MarksOutOfRangeException extends Exception
 {
    int val;
    MarksOutOfRangeException(int v)
    {
        val = v;
    }
    public String toString()
    {
         return "Marks out of range  ["+val+"]";
    }
 }   

 class Excp10
 {
    static void  checkMarks(int v) throws MarksOutOfRangeException
    {
         if(v<0 || v>100)
             throw new MarksOutOfRangeException(v);
         System.out.println("Correct Marks :"+v);   
    }
    public static void main(String [] args)
    {
       System.out.println("Program starts...");   
      try
       {
           int m1 = Integer.parseInt(args[0]);
           int m2 = Integer.parseInt(args[1]);
           checkMarks(m1);
           checkMarks(m2);
       }catch(MarksOutOfRangeException excp)
       {
         System.out.println("Error : "+excp);
       }
       System.out.println("Program ends...");
    }   
 }