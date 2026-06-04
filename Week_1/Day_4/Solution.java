public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length,column = mat[0].length;
        int originalSize = row * column;
        int requiredSize = r * c;
        if(originalSize != requiredSize) return mat;
        int res[][] = new int[r][c];
        int x =0,y=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                res[x][y] = mat[i][j];
                y++;
                if(y>=c){
                    x++;
                    y=0;
                }
                
            }
        }
        return res;
    }
} 


//Time complexity O(m * n)
// SPace complexity O(row * column)