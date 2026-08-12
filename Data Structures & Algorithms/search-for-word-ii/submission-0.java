
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        // Use a Set to avoid adding the same word multiple times to the result
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
                // Optimization: only start DFS if first char matches
                if (board[i][j] == word.charAt(0) && solve(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, int i, int j, String word, int idx) {
        // 1. Boundary and character match check
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(idx)) {
            return false;
        }

        // 2. If this was the last character of the word, we found it!
        if (idx == word.length() - 1) {
            return true;
        }

        // 3. Backtracking: Mark visited
        char temp = board[i][j];
        board[i][j] = '*'; 

        // 4. Explore all 4 directions with short-circuiting OR
        boolean found = solve(board, i + 1, j, word, idx + 1) ||
                        solve(board, i - 1, j, word, idx + 1) ||
                        solve(board, i, j + 1, word, idx + 1) ||
                        solve(board, i, j - 1, word, idx + 1);

        // 5. Restore original character
        board[i][j] = temp; 
        
        return found;
    }
}