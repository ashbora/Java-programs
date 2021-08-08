class Matrix7
{
  public static void main(String [] args)
  {     
     int m[][]= new int[10][];
     for(int i=0;i<m.length;i++)
        m[i] = new int[i+1];

     int k=10;
     for(int i=0;i<m.length;i++)
        for(int j=0;j<m[i].length;j++)
           m[i][j] = k++; 
 
     System.out.println("Matrix is");
     for(int i=0;i<m.length;i++)
     {
        for(int j=0;j<m[i].length;j++)
          System.out.print(m[i][j]+"\t");

        System.out.println(); 
     }    
  }
}