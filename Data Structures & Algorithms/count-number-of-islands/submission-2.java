class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        boolean [][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    solve(grid,i,j,visited);
                    res++;
                }
            }
        }
        return res;
    }
    public void solve(char[][] grid,int i, int j,boolean [][] visited){
        
        if(i<0 || j<0 ||i>=grid.length || j>= grid[0].length || grid[i][j] == '0' || visited[i][j]==true){
            return;
        }

        visited[i][j]=true;
    
        //up
        solve(grid,i-1,j,visited);

        //down
        solve(grid,i+1,j,visited);

        //right
        solve(grid,i,j+1,visited);

        //left
        solve(grid,i,j-1,visited);
    }

}


/*

whenever i and j goes out of bond then return;


when I see grid[i][j]==1 then call the dfs
One is visited matric where I will make it.
then move in all direction up,down,left,right
keep calculating the result.






*/