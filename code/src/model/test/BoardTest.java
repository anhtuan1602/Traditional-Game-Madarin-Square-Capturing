package model.test;

import model.board.Board;
import model.board.Cell;

public class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();

        System.out.println(board);

        Cell[] boardVis = board.getCells();
        for(Cell cell:boardVis) {
            System.out.println(cell.seeDetails());
        }
    }
}