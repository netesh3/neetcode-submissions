class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0) && solve(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};

    public boolean solve(int i,int j, char[][] board, String word,int idx){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='#'){
            return false;
        }
        if(board[i][j] != word.charAt(idx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j]='#';
        for(int[] d: dir){
            int i_ = i+d[0];
            int j_ = j+d[1];
            if(solve(i_,j_,board,word,idx+1)){
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
}
