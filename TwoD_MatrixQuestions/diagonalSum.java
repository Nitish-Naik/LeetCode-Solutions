package TwoD_MatrixQuestions;
/**
 * diagnalSum
 */
public class diagonalSum 
{
    public static void dSum(int a[][])
    {
        int sr = 0;
        // sr = starting row
        int sum=0;
        int i=sr;
        while(i <= a.length-1) 
        {
            for(int j=0; j<=a[0].length-1; j++)
            {
                if(i == j)
                {
                    sum += a[i][j];
                    i++;
                }

            }
        }
        int sum1=0;
        i=sr;
        while(i <= a.length-1) 
        {
            for(int j=a.length-1; j>=0; j--)
            {
                if(i + j == a.length-1)
                {
                    sum1 += a[i][j];
                    i++;
                }
            }
            i++;
        }
        if(a.length%2 == 1)
        {
            
            System.out.println(sum+sum1-a[a.length/2][a.length/2]);
        }
        System.out.println(sum+sum1);
    }
    public static void main(String[] args) 
    {
        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
           };
        dSum(a);
    }   
}