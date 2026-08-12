class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    res++;
                }
            }
        }
        return res;
    }
    public void dfs(int i,int j,char[][] grid){
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{i,j});
        while(!queue.isEmpty()){
            int poll[] = queue.poll();
            int row = poll[0];
            int col = poll[1];
            grid[row][col] = '0'; 
            //top bottom && left right
            if(row-1>=0 && grid[row-1][col] == '1'){
                queue.add(new int[]{row-1,col});
            }
            if(row+1<grid.length && grid[row+1][col] == '1'){
                queue.add(new int[]{row+1,col});
            }
            if(col-1>=0 && grid[row][col-1] == '1'){
                queue.add(new int[]{row, col-1});
            }
            if(col+1<grid[0].length && grid[row][col+1] == '1'){
                queue.add(new int[]{row, col+1});
            }
        }
    }
}
