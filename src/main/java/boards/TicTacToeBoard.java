package boards;

import gamestate.Board;
import gamestate.Cell;
import gamestate.Move;

public class TicTacToeBoard extends Board {
    String cells[][] = new String[3][3];

    public String getSymbol(int row, int col){
        return cells[row][col];
    }

    public void setCell(Cell cell, String symbol) {
        cells[cell.getRow()][cell.getCol()]=symbol;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result.append(cells[i][j] == null ? "-" : cells[i][j]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    @Override
    public void move(Move move) {
        //each board type should have its own move
        //tictactoe: will have its own board, similary any other board/game will have its own move defined
        //eg: chess move needs to be calculated if its a valid move or not

        setCell(move.getCell(), move.getPlayer().symbol());
    }
}
