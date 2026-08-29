class Solution {
    public boolean isValid(char[][] board, int row, int col, String word, int i)
    {
        if (row < 0 || col < 0 || row >= board.length || col >= board[row].length || board[row][col] != word.charAt(i))
        {
            return false;
        }
        if (i == word.length() - 1)
        {
            return true;
        }

        char temp = board[row][col];
        board[row][col] = '#';  

        boolean down = isValid(board, row + 1, col, word, i + 1);
        boolean up = isValid(board, row - 1, col, word, i + 1);
        boolean right = isValid(board, row, col + 1, word, i + 1);
        boolean left = isValid(board, row, col - 1, word, i + 1);

        board[row][col] = temp;  
        return up || down || right || left;
    }

    public boolean exist(char[][] board, String word)
    {
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                if (isValid(board, row, col, word, 0))
                {
                    return true;
                }
            }
        }
        return false;
    }
}