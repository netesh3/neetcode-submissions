class Solution {
    public int[][] transpose(int[][] matrix) {        
        int row = matrix.length;
        int col = matrix[0].length;
        if(row==col){
            for(int i=0;i<row;i++){
                for(int j=i;j<col;j++){
                    int temp = matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            return matrix;
        }
        
        
        int res[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
/*
1 2 3
4 5 6
7 8 9

1 4 7
2 5 6
3 8 9

2,1 = 5
1,2 = 

*/