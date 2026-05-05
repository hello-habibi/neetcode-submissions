class Solution {
    public boolean isValidSudoku(char[][] board) {

        // row check
        for (int i = 0; i < 9; i++) {
            boolean[] arr = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {           
                    int num = board[i][j] - '0';    
                    if (arr[num]) return false;
                    arr[num] = true;
                }
            }
        }

        // column check
        for (int i = 0; i < 9; i++) {
            boolean[] arr = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {           
                    int num = board[j][i] - '0';    
                    if (arr[num]) return false;
                    arr[num] = true;
                }
            }
        }

        // 3x3 box check
        for (int box = 0; box < 9; box++) {
            boolean[] arr = new boolean[10];
            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[startRow + i][startCol + j] != '.') {
                        int num = board[startRow + i][startCol + j] - '0';
                        if (arr[num]) return false;
                        arr[num] = true;
                    }
                }
            }
        }

        return true;
    }
}