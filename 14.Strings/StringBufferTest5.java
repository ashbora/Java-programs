/*
   StringBuffer insert(int index,String str)
   StringBuffer insert(int index,int num)
   StringBuffer insert(int index,float num)
   StringBuffer insert(int index,Object obj)
*/
 class StringBufferTest5
 {
   public static void main(String [] args)
   {
      StringBuffer s = new StringBuffer("Testing the methods");          
      System.out.println(s);
      s.insert(8,'-');
      System.out.println(s);
      long pin=445001;
      s.insert(12,pin);   
      System.out.println(s); 
   }
 } 