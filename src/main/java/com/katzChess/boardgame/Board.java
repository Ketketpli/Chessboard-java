package com.katzChess.boardgame;

import lombok.Getter;
import lombok.Setter;

public class Board {

    @Getter
    @Setter
    private int rows, columns;
    private Piece[][] pieces;

    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }
}
