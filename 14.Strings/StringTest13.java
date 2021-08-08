 /*
 int compareTo(String str)
*/
 class StringTest13
 {
   public static void main(String [] args)
   {
     String [] s = {"Kunal","Suraj","Dipak","Hitesh","Nikhil","Jay","Pankaj","Akshay","Anand","Rahul"};
     for(int i=0;i<s.length-1;i++)
       for(int j=i+1;j<s.length;j++)
          if(s[i].compareTo(s[j])>0)
          {
             String temp=s[i];
             s[i]=s[j];
             s[j] = temp;
          }
     for(int i=0;i<s.length;i++)
         System.out.println(s[i]); 
 
   }
 }