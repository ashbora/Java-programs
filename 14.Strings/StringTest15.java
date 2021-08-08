 /*
  int lastIndexOf(int ch)
  int lastIndexOf(int ch,int startIndex)
  int lastIndexOf(String str)
  int lastIndexOf(String str,int startIndex) 
 */
 class StringTest15
 {
   public static void main(String [] args)
   {
      String s="Incrediable India";
      int p1 = s.lastIndexOf('i');
      int p2 = s.lastIndexOf('i',p1-1);
      System.out.println("Last occurance of i         :"+p1);
      System.out.println("Before last occurance of i  :"+p2);    
      int p3 = s.lastIndexOf("In");
      int p4 = s.lastIndexOf("In",p3-1);
      System.out.println("Last  occurance of In  :"+p3);
      System.out.println("Before last occurance of In :"+p4);    
   }
 }