package com.katzChess.chessPieces;

import com.katzChess.boardgame.Board;
import com.katzChess.chess.ChessPiece;
import com.katzChess.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
