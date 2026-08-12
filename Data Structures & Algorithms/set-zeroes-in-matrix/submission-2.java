class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<int[]> list = new ArrayList();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }
        Set<Integer> rowSet = new HashSet();
        Set<Integer> colSet = new HashSet();
        for(int[] a: list){
            int r = a[0];
            int c = a[1];
            if(!rowSet.contains(r)){
                markRow(matrix,r);
                rowSet.add(r);
            }
            if(!colSet.contains(c)){
               markCol(matrix,c);
               colSet.add(c);
            }
        }

    }
    public void markRow(int[][] matrix,int r){
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i] = 0;
        }
    }
    public void markCol(int[][] matrix,int c){
        for(int i=0;i<matrix.length;i++){
            matrix[i][c] = 0;
        }
    }
}

/*
[   
[1,2,3],
[4,0,0],
[6,0,0]]

[1,0,0],
[0,0,0],
[0,0,0]

*/
