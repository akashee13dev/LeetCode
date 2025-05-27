package medium.LC36;

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        final int N = 9;
        final int gridLen = 3;
        HashSet<Character>[] rowSet = new HashSet[N];
        HashSet<Character>[] colSet = new HashSet[N];
        HashSet<Character>[] gridSet = new HashSet[N];

        for(int ind = 0 ; ind< N ; ind++){
            rowSet[ind] = new HashSet();
            colSet[ind] = new HashSet();
            gridSet[ind] = new HashSet();
        }

        for(int x = 0 ; x < rows ; x++){
            for(int y = 0 ; y < cols ; y++){
                char ch = board[x][y];
                if(ch == '.'){
                    continue;
                }
                if(rowSet[x].contains(ch)){
                    return false;
                }
                rowSet[x].add(ch);
                if(colSet[y].contains(ch)){
                    return false;
                }
                colSet[y].add(ch);

                int gridIndex = x / gridLen * (N/gridLen) + y/gridLen;
                if(gridSet[gridIndex].contains(ch)){
                    return false;
                }
                gridSet[gridIndex].add(ch);
            }
        }
        return true;
    }

}
