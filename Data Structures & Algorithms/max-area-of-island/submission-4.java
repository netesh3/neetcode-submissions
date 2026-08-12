class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int res = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    int size = dfs(i,j,grid);
                    if(size>res){
                        res = size;
                    }
                }
            }
        }
        return res;
    }

    public int dfs(int i, int j, int[][] grid){
        Queue<int[]> queue = new LinkedList();
        System.out.println(i +" : "+ j);
        queue.add(new int[]{i,j});
        int count = 0;
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int row = poll[0];
            int col = poll[1];
            grid[row][col] = 0;
            System.out.println(row +" :Test "+ col);
            count++;
            //top bottom && left right
            if(row-1>=0 && grid[row-1][col] == 1){
                queue.add(new int[]{row-1,col});
                grid[row-1][col] = 0;
            }
            if(row+1<grid.length && grid[row+1][col] ==1){
                queue.add(new int[]{row+1,col});
                grid[row+1][col] = 0;
            }
            if(col-1>=0 && grid[row][col-1] == 1){
                queue.add(new int[]{row,col-1});
                grid[row][col-1] = 0;
            }
            if(col+1<grid[0].length && grid[row][col+1] == 1){
                queue.add(new int[]{row,col+1});
                grid[row][col+1] = 0;
            }
        }
        return count;
    }
}
//c = 2
// 0,1\1,1

// [[0,1,0,0,0],
//  [0,1,0,0,0],
//  [0,0,0,1,1],
//  [0,0,0,1,1]]