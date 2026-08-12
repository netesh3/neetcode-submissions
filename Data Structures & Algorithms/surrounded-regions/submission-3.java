class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]== 'O' && (i == 0 || i == row-1 || j == 0 || j == col-1)){
                    markIt(board,i,j);
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == 'Z'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void markIt(char[][] board, int i, int j){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] == 'X' || board[i][j]=='Z'){
            return;
        }
        board[i][j]='Z';
        //up
        markIt(board,i-1,j);
        //down
        markIt(board,i+1,j);
        //left
        markIt(board,i,j-1);
        //right
        markIt(board,i,j+1);
    }
}


/*
    0,  1,  2,   3
 0 ["X","X","X","X"],
 1 ["X","-1","-1","X"],
 2 ["X","-1","-1","X"],
 3 ["X","X","-1","-1"]
*/