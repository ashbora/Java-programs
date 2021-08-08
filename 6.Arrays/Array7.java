 class Array7
 {
    public static void main(String [] args)
    {
      int [][]m;
      m = new int[][]{{32,55,23,87,54},
                      {10,63,27,85,46},
                      {20,86,10,97,33},
                      {36,74,55,56,76}
                     };
      int i,j;
     
      //display the matrix
      for(i=0;i<m.length;i++)
      {
        for(j=0;j<m[i].length;j++)
          System.out.print(m[i][j]+"\t");
        System.out.println();
      }      
 
    }
 }