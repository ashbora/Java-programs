 class Array9
 {
    public static void main(String [] args)
    {
      int [][]m;
      m = new int[5][];
      int i,j;
      m[0] = new int [6];
      m[1] = new int [2];
      m[2] = new int [4];
      m[3] = new int [1];
      m[4] = new int [5];
      
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