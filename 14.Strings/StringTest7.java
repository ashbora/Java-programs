 /*
  char [] toCharArray()
 */
 class StringTest7
 {
   public static void main(String [] args)
   {
     String s = "Java Programming"; 
     char arr[] = s.toCharArray();
     for(char ch:arr)
       System.out.println(ch);
   }
 }