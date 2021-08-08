 class Test
 {
   int a,b;
   Test(int a,int b)
   {
       this.a = a;
       this.b = b;      
   }
   void display()
   {
         System.out.println("a="+a+"\tb="+b);
   }
   Test getClone()
   { 
        Test r=null;
        try{
        r = (Test) this.clone();
       }catch(CloneNotSupportedException excp)
        {}
       return r;
   }
   public String toString() 
   {
        return "this is my string object";
     }
 }
 class ObjectTest
 {
    public static void main(String [] args)
    {
          Test t1 = new Test(12,34);
          Test t2 = t1;
          if(t1.equals(t2))
            System.out.println("t1 and t2 are the same instances");
          else
             System.out.println("t1 and t2 are not the same instances");  
   
          Test t3 = t1.getClone();
          System.out.println("t1 discription :"+t1.toString());
          System.out.println("Hash code of t1 :"+t1.hashCode());
    }
 }