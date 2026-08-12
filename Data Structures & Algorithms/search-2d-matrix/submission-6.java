class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = matrix.length;
        int i = 0;
        int j = col;
        while(i<row && j>=0){
            if(matrix[i][j]==target){
                    return true;
                }
                if(matrix[i][j]>target){
                    j--;// move left
                }else{
                    i++;// move down
                }
        }
        return false;
    }
}