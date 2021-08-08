 class Array8
 {
    public static void main(String [] args)
    {
      int [][]m;
      m = new int[4][];
      int i,j;
      for(i=0;i<4;i++)
        m[i] = new int[5];
          
      //storing the values
      int k=51;
      for(i=0;i<m.length;i++)
        for(j=0;j<m[i].length;j++)
          m[i][j]=k++;

      //display the matrix
      for(i=0;i<m.length;i++)
      {
        for(j=0;j<m[i].length;j++)
          System.out.print(m[i][j]+"\t");
        System.out.println();
      }      
 
    }
 }