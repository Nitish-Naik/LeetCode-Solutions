class LargestLocalValues_in_a_Matrix {
    private static int FCM(int[][] grid,int row,int col)
    {
        int maxVal=0;
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                maxVal=Math.max(maxVal,grid[i][j]);
            }
        }
        return maxVal;
    }
    public static int[][] largestLocal(int[][] grid) {
       int n=grid.length;
       int [][] maxLocal=new int[n-2][n-2];
       for(int row=0;row<n-2;row++)
       {
        for(int col=0;col<n-2;col++)
        {
            maxLocal[row][col]=FCM(grid,row,col);
        }
       } 
       return maxLocal;
    }
    public static void main(String[] args) {
        int a[][] = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int b[][] = largestLocal(a);
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[0].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}