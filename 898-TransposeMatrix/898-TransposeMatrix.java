// Last updated: 8/11/2026, 11:26:29 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
       //  matrix[][]=new int[matrix[0].length][matrix.length];
       int r=matrix.length;
       int c=matrix[0].length;
       int a[][]=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                a[i][j]=matrix[j][i];
            }
        }
        return a;
        
    }
}
        
    
