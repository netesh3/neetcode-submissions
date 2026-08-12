class NumMatrix {

    private int matrix[][];
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        System.out.println();
        for(int i = row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                System.out.print(" "+matrix[i][j]);
                res+= matrix[i][j];
            }
            System.out.println();
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */


 /*
[
    [
        [
            [3, 0, 1, 4, 2],
            [5, 6, 3, 2, 1],
            [1, 2, 0, 1, 5],
            [4, 1, 0, 1, 7],
            [1, 0, 3, 0, 5]
        ]
    ], 
    
    [2, 1, 4, 3], 8
    [1, 1, 2, 2], 11
    [1, 2, 2, 4], 12
]


 */