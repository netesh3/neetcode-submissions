class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<col;i++){
            int r = row-1;
            int j = 0;
            while(j<=r){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[r][i];
                matrix[r][i] = temp;
                j++;r--;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

/*
1 2
3 4
reverse verticle
3 4
1 2

//treanspose the matrix
3 1
4 2

*/