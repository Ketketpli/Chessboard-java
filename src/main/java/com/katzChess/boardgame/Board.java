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

    public Piece piece(int rows, int columns) {
        return pieces[rows][columns];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
         pieces[position.getRow()][position.getColumn()] = piece;
         piece.position = position;
    }
}
