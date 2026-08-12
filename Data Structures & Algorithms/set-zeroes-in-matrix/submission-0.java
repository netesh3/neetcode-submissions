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

        for(int[] a: list){
            int r = a[0];
            int c = a[1];
            mark(matrix,r,c);
        }

    }
    public void mark(int[][] matrix,int r, int c){
        for(int i=0;i<matrix[0].length;i++){
            System.out.println("mm: "+ r +" : "+c);
            matrix[r][i] = 0;
            System.out.println("out: "+ r +" : "+c);
        }

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
