// Last updated: 8/11/2026, 11:28:36 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int value=1;
        int [][]a=new int[n][n];
       for(int i=0; i<(n+1)/2; i++) {           // outer loop
            for(int j=i; j<n-i; j++) {           // inner loop
                a[i][j]=value++;
            }

            //to fill right cols
            for(int j=i+1; j<n-i; j++) {
                a[j][n-i-1]=value++;
            }

            //to fill bottom row
            for(int j=n-i-2; j>=i; j--) {
                a[n-i-1][j]=value++;
            }

            //to fill left col
            for(int j=n-i-2; j>i; j--) {
                a[j][i]=value++;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(a[i][j]+"\t");
            }
             System.out.println();
        }
        return a;  
    }
}