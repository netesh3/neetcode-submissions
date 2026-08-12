class Solution {
    // public int orangesRotting(int[][] grid) {
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     int ans[][] = new int[row][col];

    //     for (int[] innerArray : ans) {
    //          Arrays.fill(innerArray, Integer.MAX_VALUE);
    //     }

    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             if(grid[i][j]==2){
    //                 solve(grid,i,j,0,ans);
    //             }
    //         }
    //     }
    //     int res = 0;
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             if(grid[i][j]==1){
    //                 res = Math.max(res,ans[i][j]);
    //             }
    //         }
    //     }
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             if(grid[i][j]==1 && ans[i][j]== Integer.MAX_VALUE){
    //                 return -1;
    //             }
    //         }
    //     }
    //     return res;
    // }

    // public void solve(int [][] grid, int i,int j,int count, int[][] ans){
    //     if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]==0){
    //         return;
    //     }

    //     if(count>=ans[i][j]){
    //         return;
    //     }
    //     ans[i][j]= count;
    //     count++;

    //     //up
    //     solve(grid,i-1,j,count,ans);
    //     solve(grid,i+1,j,count,ans);
    //     solve(grid,i,j-1,count,ans);
    //     solve(grid,i,j+1,count,ans);
    // }











    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int row1 = grid.length;
        int col1 = grid[0].length;
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }

        boolean visited[][] = new boolean[row1][col1];

        int res = 0;
        while(!queue.isEmpty()){
            boolean isRooten= false;
            int levelNode = queue.size();
            for(int level = 0;level<levelNode;level++){
                int[] pop = queue.poll();
                int row = pop[0];
                int col = pop[1];
                visited[row][col] = true;
                //up
                if(row-1>=0 && col>=0 && grid[row-1][col]==1 && !visited[row-1][col]){
                    grid[row-1][col] = 2;
                    queue.add(new int[]{row-1,col});
                    isRooten = true;
                }
                //down
                if(row+1<grid.length && col>=0 && grid[row+1][col] == 1 && !visited[row+1][col]){
                    grid[row+1][col] = 2;
                    queue.add(new int[]{row+1,col});
                    isRooten = true;
                }
                //left
                if(col-1>=0 && row<grid.length && grid[row][col-1] ==1 && !visited[row][col-1]){
                    grid[row][col-1] = 2;
                    queue.add(new int[]{row,col-1});
                    isRooten = true;
                }
                //right
                if(col+1<grid[0].length && row>=0 && grid[row][col+1] == 1 && !visited[row][col+1]){
                    grid[row][col+1] = 2;
                    queue.add(new int[]{row,col+1});
                    isRooten = true;
                }
            }
            if(isRooten)
                res++;
            
        }

        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return res;
    }

}



/*

[
       0 1 2
    0 [1,0,0],
    1 [0,1,1],
    2 [0,1,2]

       0 1 2
    0 [T,f,f],
    1 [f,f,f],
    2 [f,f,T]
]


ans = 1;
Q = [(2,2)(0,0),1,2,3,4,5,6,7]
> When pop mark visited matrix to 'TRUE' and (set the value to 2) 
        and increement the res
*/




















// [
//     [1,2,0],
//     [0,1,1],
//     [1,1,2]]

//     [1,0,0],
//     [0,1,1],
//     [2,1,0]]


// ] count = 1;
