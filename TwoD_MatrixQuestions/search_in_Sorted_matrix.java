package TwoD_MatrixQuestions;
public class search_in_Sorted_matrix 
{
    public static boolean search(int a[][], int x)
    {
        int row = 0;
        int col = a[0].length-1;
        while(row < a.length && col >= 0) 
        {
            if(a[row][col] == x)
            {
                return true;
            }
            else if(a[row][col] > x)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int a[][] = {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}
                    };
        System.out.println(search(a, 33));
    }    
}
