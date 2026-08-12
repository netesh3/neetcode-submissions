class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int colors) {
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{sr,sc});

        /*
            Top, Bottom
            Left, Right
        */
        int color = image[sr][sc];
        if(color == colors){
            return image;
        }
        int row = image.length-1;
        int col = image[0].length-1;
        while(!queue.isEmpty()){
            int paint[] = queue.poll();
            image[paint[0]][paint[1]] = colors;
            if(paint[0]-1>=0 && image[paint[0]-1][paint[1]] == color){
                queue.add(new int[]{paint[0]-1,paint[1]});
            }
            if(paint[0]+1<=row && image[paint[0]+1][paint[1]] == color){
                queue.add(new int[]{paint[0]+1,paint[1]});
            }
            if(paint[1]-1>=0 && image[paint[0]][paint[1]-1] == color){
                queue.add(new int[]{paint[0],paint[1]-1});
            }
            if(paint[1]+1<=col && image[paint[0]][paint[1]+1] == color){
                queue.add(new int[]{paint[0],paint[1]+1});
            }
        }
        return image;
    }
}