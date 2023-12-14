package TwoD_MatrixQuestions;
public class spiralMatric 
{
    public static void SpiralMatrix(int a[][])
    {
        int top = 0;
        int bottom = a.length-1;
        int left = 0;
        int right = a[0].length-1;
        while(top <= bottom)
        {
            // top 
            for(int i=left; i<=right; i++)
            {
                System.out.print(a[top][i]+" ");
            }
            
            top++;
            // right
            for(int j=top; j<=bottom; j++)
            {
                System.out.print(a[j][right]+" ");
            }
            right--;
            // bottom
            if(top <= bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
            }
            
            // left

            if(top <= bottom)
            {

                for(int i=bottom; i>top; i--)
                {
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) 
    {
        int a[][] = {
                     {1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}
                    };
        SpiralMatrix(a);
    }   
}