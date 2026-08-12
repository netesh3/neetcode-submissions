class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    int count = solve(grid,i,j);
                    max = Math.max(count,max);
                }
            }
        }
        return max;
    }

    public int solve(int grid[][],int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        //up //down //left //right
        return 1+solve(grid,i-1,j)+solve(grid,i+1,j)+solve(grid,i,j-1)+solve(grid,i,j+1);
    }


}
//c = 2
// 0,1\1,1

// [[0,1,0,0,0],
//  [0,1,0,0,0],
//  [0,0,0,1,1],
//  [0,0,0,1,1]]