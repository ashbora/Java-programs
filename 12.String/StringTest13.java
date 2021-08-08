/*
 Sorting
*/
class StringTest13
{
  public static void main(String [] args)
  {
     String name[] = {"Pratima","Shivani","Neha","Poonam","Kiran"};
     int i,j;
     for(i=0;i<name.length-1;i++)
     {
        for(j=i+1;j<name.length;j++)
          if(name[i].compareTo(name[j])>0)
           {
               String temp = name[i];
               name[i] = name[j];
               name[j] = temp;
           }
     } 
      //output
     for(i=0;i<name.length;i++)
        System.out.println(name[i]);
  }
}