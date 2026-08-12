class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int end = row*col-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(matrix[mid/col][mid%col]>target){
                end = mid-1;
            }else if(matrix[mid/col][mid%col]<target){
                start = mid+1;
            }else {
                return true;
            }
        }
        return false;
    }

    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int col = matrix[0].length-1;
    //     int row = matrix.length;
    //     int i = 0;
    //     int j = col;
    //     while(i<row && j>=0){
    //         if(matrix[i][j]==target){
    //                 return true;
    //             }
    //             if(matrix[i][j]>target){
    //                 j--;// move left
    //             }else{
    //                 i++;// move down
    //             }
    //     }
    //     return false;
    // }
}