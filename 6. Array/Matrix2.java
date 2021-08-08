class Matrix2
{
  public static void main(String [] args)
  {     
     int m[][] = new int[][]{{43,56,12,77},{44,33,77,25},{98,55,24,74}};

     System.out.println("Matrix is");
     for(int i=0;i<3;i++)
     {
        for(int j=0;j<4;j++)
          System.out.print(m[i][j]+"\t");

        System.out.println(); 
     }    
  }
}