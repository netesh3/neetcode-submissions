class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans[][] = new int[row][col];

        for (int[] innerArray : ans) {
             Arrays.fill(innerArray, Integer.MAX_VALUE);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    solve(grid,i,j,0,ans);
                }
            }
        }
        int res = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    res = Math.max(res,ans[i][j]);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && ans[i][j]== Integer.MAX_VALUE){
                    return -1;
                }
            }
        }
        return res;
    }

    public void solve(int [][] grid, int i,int j,int count, int[][] ans){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]==0){
            return;
        }

        if(count>=ans[i][j]){
            return;
        }
        ans[i][j]= count;
        count++;

        //up
        solve(grid,i-1,j,count,ans);
        solve(grid,i+1,j,count,ans);
        solve(grid,i,j-1,count,ans);
        solve(grid,i,j+1,count,ans);
    }
}

// [
//     [1,2,0],
//     [0,1,1],
//     [1,1,2]]

//     [1,0,0],
//     [0,1,1],
//     [2,1,0]]


// ] count = 1;
