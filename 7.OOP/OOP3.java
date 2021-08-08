 class NumericOperations
 {
     int n1,n2;
     void setNumbers(int a,int b)
     {
       n1=a;
       n2=b;
     }
     void displayNumbers()
     {
        System.out.println("First number  :"+n1);
        System.out.println("Second number :"+n2);
     }
    void findAddition()
    {
        int add = n1+n2;
        System.out.println("Addition      :"+add);
    }
    void findSubtraction()
    {
        int sub = n1-n2;
        System.out.println("Subtraction   :"+sub);
    }
    void findMultiplication()
    {
        int mul = n1*n2;
        System.out.println("Multiplication:"+mul);
    }
    void findDivision()
    {
        float div = (float)n1/n2;
        System.out.println("Division      :"+div);
    }
    void findAverage()
    {
        float avg = (n1+n2)/2.0f;
        System.out.println("Average       :"+avg);
    }
 }
 class OOP3
 {
   public static void main(String [] args)
   {
       int n1 = Integer.parseInt(args[0]);
       int n2 = Integer.parseInt(args[1]);
       NumericOperations num = new NumericOperations();
       num.setNumbers(n1,n2);
       num.displayNumbers();
       num.findAddition();
       num.findSubtraction();
       num.findMultiplication();
       num.findDivision();
       num.findAverage();
   } 
 }