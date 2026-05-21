package com.katzChess.chessPieces;

import com.katzChess.boardgame.Board;
import com.katzChess.chess.ChessPiece;
import com.katzChess.chess.Color;

public class Hook extends ChessPiece {

    public Hook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R ";
    }
}
