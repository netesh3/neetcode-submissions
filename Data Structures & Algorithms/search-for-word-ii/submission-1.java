
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<>();
        for (String word : words) {
            if (find(board, word)) {
                res.add(word);
            }
        }
        return new ArrayList<>(res);
    }

    public boolean find(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0) && solve(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, int i, int j, String word, int idx) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(idx)) {
            return false;
        }

        if (idx == word.length() - 1) {
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '*'; 

        boolean found = solve(board, i + 1, j, word, idx + 1) ||
                        solve(board, i - 1, j, word, idx + 1) ||
                        solve(board, i, j + 1, word, idx + 1) ||
                        solve(board, i, j - 1, word, idx + 1);

        board[i][j] = temp; 
        
        return found;
    }
}