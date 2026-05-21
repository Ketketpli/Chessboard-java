package com.katzChess.boardgame;

import lombok.AccessLevel;
import lombok.Getter;

public class Piece {

    @Getter(AccessLevel.PROTECTED)
    private Board board;

    protected Position position;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

}
