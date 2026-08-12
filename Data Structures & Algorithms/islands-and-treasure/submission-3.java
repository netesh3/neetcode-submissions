class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    solve(grid,i,j,0);
                }
            }
        }
    }

    public void solve(int [][] grid, int i, int j,int count){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == -1){
            return;
        }

        if(count> grid[i][j]){
            return;
        }

        grid[i][j] = count;
        count++;
        //up
        solve(grid,i-1,j,count);
        //down
        solve(grid,i+1,j,count);
        //left
        solve(grid,i,j-1,count);
        //right
        solve(grid,i,j+1,count);
    }
}
/*

[
  [,  -1, 0, ],
  [,  ,  , -1],
  [1,  -1, , -1],
  [0,  -1,, ]
]


*/