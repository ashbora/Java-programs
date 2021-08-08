 /*
  int indexOf(int ch)
  int indexOf(int ch,int startIndex)
  int indexOf(String str)
  int indexOf(String str,int startIndex)
 */
 class StringTest14
 {
   public static void main(String [] args)
   {
      String s="Incrediable India";
      int p1 = s.indexOf('i');
      int p2 = s.indexOf('i',p1+1);
      System.out.println("First occurance of i   :"+p1);
      System.out.println("Second occurance of i  :"+p2);    
      int p3 = s.indexOf("In");
      int p4 = s.indexOf("In",p3+1);
      System.out.println("First occurance of In  :"+p3);
      System.out.println("Second occurance of In :"+p4);    
   }
 }