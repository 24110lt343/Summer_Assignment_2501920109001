import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int left = 0;
        int right = c - 1;
        int bottom = r - 1;

        List<Integer> lst = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                lst.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                lst.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    lst.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {   
                for (int i = bottom; i >= top; i--) {
                    lst.add(matrix[i][left]);
                }
                left++;
            }
        }

        return lst;
    }
}


//Time complexity O(m*n)
//Space complexity O(m * n)
