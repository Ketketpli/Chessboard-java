package com.katzChess.chess;

import com.katzChess.boardgame.Board;
import com.katzChess.boardgame.Piece;
import lombok.Getter;

public class ChessPiece extends Piece {

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    @Getter
    private Color color;
}
