package com.katzChess.chessPieces;

import com.katzChess.boardgame.Board;
import com.katzChess.chess.ChessPiece;
import com.katzChess.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    public String toString() {
        return "K ";
    }
}
