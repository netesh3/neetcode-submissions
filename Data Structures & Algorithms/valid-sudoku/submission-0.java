class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;
        
        for(int i=0;i<row;i++){
            Set<Character> set = new HashSet();
            for(int j=0;j<col;j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }

        for(int i=0;i<row;i++){
            Set<Character> set = new HashSet();
            for(int j=0;j<col;j++){
                char ch = board[j][i];
                if(ch == '.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }

        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int rowi = (square / 3) * 3 + i;
                    int coli = (square % 3) * 3 + j;
                    if (board[rowi][coli] == '.') continue;
                    if (seen.contains(board[rowi][coli])) return false;
                    seen.add(board[rowi][coli]);
                }
            }
        }
        
        return true;
        // [0,0],[0,1][0,2]......
        // [1,0],[1,1][1,2]......
        // [2,0],[2,1][2,2].....

        // col = 0 to 2
        // col = 3 to 5
        // col = 6 to 8

        // row = 0 to 2

    }
}
