/**
 * Leetcode_2326
 */
public class Leetcode_2326 {
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int mat[][] = new int[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int mat[][] = spiralMatrix(3, 4, null);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] = " ");
            }
        }
    }
}