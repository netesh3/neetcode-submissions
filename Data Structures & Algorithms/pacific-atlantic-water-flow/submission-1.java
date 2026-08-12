class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0) return res;
        
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // 1. Start DFS from the horizontal edges (Top and Bottom)
        for (int j = 0; j < cols; j++) {
            dfs(0, j, pacific, heights[0][j], heights, pacific); // Top edge (Pacific)
            dfs(rows - 1, j, atlantic, heights[rows - 1][j], heights, atlantic); // Bottom edge (Atlantic)
        }

        // 2. Start DFS from the vertical edges (Left and Right)
        for (int i = 0; i < rows; i++) {
            dfs(i, 0, pacific, heights[i][0], heights, pacific); // Left edge (Pacific)
            dfs(i, cols - 1, atlantic, heights[i][cols - 1], heights, atlantic); // Right edge (Atlantic)
        }

        // 3. Find cells where both boolean maps are true
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    private void dfs(int r, int c, boolean[][] ocean, int prevHeight, int[][] heights, boolean[][] visited) {
        // Stop if: Out of bounds, already visited, or current height is LOWER than previous 
        // (because we are moving "uphill" from the ocean)
        if (r < 0 || c < 0 || r >= heights.length || c >= heights[0].length || 
            visited[r][c] || heights[r][c] < prevHeight) {
            return;
        }

        visited[r][c] = true;
        
        // Explore all 4 directions
        dfs(r + 1, c, ocean, heights[r][c], heights, visited);
        dfs(r - 1, c, ocean, heights[r][c], heights, visited);
        dfs(r, c + 1, ocean, heights[r][c], heights, visited);
        dfs(r, c - 1, ocean, heights[r][c], heights, visited);
    }


    // public List<List<Integer>> pacificAtlantic(int[][] heights) {
    //     int row = heights.length;
    //     int col = heights[0].length;
    //     boolean[][] p = new boolean[row][col];
    //     boolean[][] a = new boolean[row][col];

    //     //first row
    //     for(int i=0;i<col;i++){
    //         p[0][i]=true;
    //     }
    //     //first col
    //     for(int i=0;i<row;i++){
    //         p[i][0] = true;
    //     }

    //     //last row
    //     for(int i=0;i<col;i++){
    //         a[row-1][i]=true;
    //     }

    //     //last col
    //     for(int i=0;i<row;i++){
    //         a[i][col-1]=true;
    //     }

    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             System.out.print(p[i][j]+ " , ");
    //         }
    //         System.out.println();
    //     }

    //     System.out.println("#####");

    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             System.out.print(a[i][j]+ " , ");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=1;i<row-1;i++){
    //         for(int j=1;j<col;j++){
    //             if((heights[i][j-1]<=heights[i][j]) && p[i][j-1] == true){
    //                 p[i][j]=true;
    //             }else if(heights[i-1][j]<=heights[i][j] && p[i-1][j] == true){
    //                 p[i][j]=true;
    //             }
    //         }
    //     }

    //     // for(int i=row-1;i>0;i--){
    //     //     for(int j=col-1;j>0;j--){
    //     //         if((heights[i][j+1]<=heights[i][j]) && a[i][j+1] == true){
    //     //             a[i][j]=true;
    //     //         }else if(heights[i+1][j]<=heights[i][j] && a[i+1][j] == true){
    //     //             a[i][j]=true;
    //     //         }
    //     //     }
    //     // }

    //     for (int i = row - 1; i >= 0; i--) {
    //         for (int j = col - 1; j >= 0; j--) {
    //             // Check Right neighbor
    //             if (j + 1 < col && heights[i][j+1] <= heights[i][j] && a[i][j+1]) {
    //                 a[i][j] = true;
    //             }
    //             // Check Bottom neighbor
    //             if (i + 1 < row && heights[i+1][j] <= heights[i][j] && a[i+1][j]) {
    //                 a[i][j] = true;
    //             }
    //         }
    //     }
        
    //     System.out.println("Test");
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             System.out.print(p[i][j]+ " , ");
    //         }
    //         System.out.println();
    //     }


    //      System.out.println("Test2");
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             System.out.print(a[i][j]+ " , ");
    //         }
    //         System.out.println();
    //     }
    //     List<List<Integer>> res = new ArrayList();
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             if(a[i][j] == true && p[i][j]== true){
    //                 List<Integer> in = new ArrayList();
    //                 in.add(i);
    //                 in.add(j);
    //                 res.add(in);
    //             }
    //         }
    //     }
    //     return res;
    // }
}
