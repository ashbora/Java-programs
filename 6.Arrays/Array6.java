 class Array6
 {
    public static void main(String [] args)
    {
      int [][]m;
      m = new int[4][5];
      int i,j,k=10;
      //storing values in matrix
      for(i=0;i<4;i++)
        for(j=0;j<5;j++)
          m[i][j]=k++;
  
      //display the matrix
      for(i=0;i<4;i++)
      {
        for(j=0;j<5;j++)
          System.out.print(m[i][j]+"\t");
        System.out.println();
      }      
 
    }
 }