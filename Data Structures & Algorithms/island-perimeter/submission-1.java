class Solution {

    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    queue.add(new int[]{i,j});
                } 
            }
        }
        int res = 0;
        
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int r = poll[0];
            int c = poll[1];
            grid[r][c] = -1;
        
            for(int[] dir: dirs){
                int nr = dir[0] + r;
                int nc = dir[1] + c;
                if(nr < 0 || nr >= row || nc < 0 || nc >= col || grid[nr][nc] == 0) {
                    res++;
                }
            }
        }

        return res;
    }

    // public void solve(int[][] grid,int i, int j){
    //     if(i<0 || j<0 || i>grid.length || j>grid[0].length || grid[i][j]!=1){
    //         return;
    //     }

    //     if((i-1<0 || j-1<0 || i+1>=grid.length || j+1>=grid.length) && grid[i][j]==1){
    //         res++;
    //     }
    //     //up
    //     solve(grid,i-1,j);

    //     //down
    //     solve(grid,i+1,j);

    //     //left
    //     solve(grid,i,j-1);

    //     //right
    //     solve(grid,i,j+1);
    // }
}

/*

[0,1,1,1,1,1],
[0,0,1,1,1,1],
[0,1,1,0,0,1],
[0,0,0,0,0,0]

1-4
2-6
3-8
8*2=16+2 = 18;

*/