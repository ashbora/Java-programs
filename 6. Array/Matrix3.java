class Matrix3
{
  public static void main(String [] args)
  {     
     int m[][] = {
                  {43,56,12,77},
                  {44,33,77,25},
                  {98,55,24,74}
                 };

     System.out.println("Matrix is");
     for(int i=0;i<m.length;i++)
     {
        for(int j=0;j<m[i].length;j++)
          System.out.print(m[i][j]+"\t");

        System.out.println(); 
     }    
  }
}