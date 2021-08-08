  /*
     Method/function overloading  
  */
  class Averages
  {
     float average(int a,int b)
     {
       float avg = (a+b)/2.0f;    
       return avg;
     }
     float average(float a,float b)
     {
       float avg = (a+b)/2.0f;    
       return avg;
     }
     float average(int a,int b,int c)
     {
       float avg = (a+b+c)/3.0f;    
       return avg;
     }
     float average(float a,float b,float c)
     {
       float avg = (a+b+c)/3.0f;    
       return avg;
     }
  }

  class OOP7 
  {
     public static void main(String [] args)
     {
       Averages av = new Averages();
       int x=65,y=90,z=59;
       System.out.println("Average of "+x+" and "+y+" is "+av.average(x,y)); 
       System.out.println("Average of "+x+","+y+" and "+z+" is "+av.average(x,y,z)); 
       float p=5.6f,q=9.6f,r=4.7f;
       System.out.println("Average of "+p+" and "+q+" is "+av.average(p,q)); 
       System.out.println("Average of "+p+","+q+" and "+r+" is "+av.average(p,q,r)); 
     }
  }