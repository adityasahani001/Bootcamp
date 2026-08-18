// 54. Spiral Matrix
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            // 1. Traverse Right
            for (int col = left; col <= right; col++) {
                res.add(matrix[top][col]);
            }
            top++;
            
            // 2. Traverse Down
            for (int row = top; row <= bottom; row++) {
                res.add(matrix[row][right]);
            }
            right--;
            
            // 3. Traverse Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    res.add(matrix[bottom][col]);
                }
                bottom--;
            }
            
            // 4. Traverse Up
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    res.add(matrix[row][left]);
                }
                left++;
            }
        }
        
        return res;
    }
}
