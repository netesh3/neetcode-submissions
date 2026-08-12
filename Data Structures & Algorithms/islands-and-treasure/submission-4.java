class Solution {

    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}}; 
                    

        while(!queue.isEmpty()){
                int pop[] = queue.poll();
                int r = pop[0];
                int c = pop[1];
                
                for(int[] dir: dirs){
                    int nr = dir[0] + r;
                    int nc = dir[1] + c;
                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==2147483647){
                        grid[nr][nc] = grid[r][c]+1;
                        queue.add(new int[]{nr,nc});
                    }
                }

                // //up
                // if(r-1>=0 && c>=0 && grid[r-1][c] == 2147483647){
                //     grid[r-1][c] = Math.min(grid[r][c]+1,grid[r-1][c]);
                // }
                // //down
                // if(r+1<grid.length && c>=0 && grid[r+1][c] == 2147483647){
                    
                //     grid[r+1][c] = Math.min(grid[r][c]+1,grid[r+1][c]);
                    
                // }
                // //left  
                // if(r<grid.length && c-1>=0 && grid[r][c-1]== 2147483647){
                //     grid[r][c-1] = Math.min(grid[r][c]+1,grid[r][c-1]);
                // }
                // //right
                // if(r>=0 && c+1<grid[0].length && grid[r][c] == 2147483647){
                //     grid[r][c+1] = Math.min(grid[r][c]+1,grid[r][c+1]);
                // }
            }
        // }
    }

    // public void islandsAndTreasure(int[][] grid) {
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             if(grid[i][j]==0){
    //                 solve(grid,i,j,0);
    //             }
    //         }
    //     }
    // }

    // public void solve(int [][] grid, int i, int j,int count){
    //     if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == -1){
    //         return;
    //     }

    //     if(count> grid[i][j]){
    //         return;
    //     }

    //     grid[i][j] = count;
    //     count++;
    //     //up
    //     solve(grid,i-1,j,count);
    //     //down
    //     solve(grid,i+1,j,count);
    //     //left
    //     solve(grid,i,j-1,count);
    //     //right
    //     solve(grid,i,j+1,count);
    // }
}
/*

[
  [,  -1, 0, ],
  [,  ,  , -1],
  [1,  -1, , -1],
  [0,  -1,, ]
]


*/