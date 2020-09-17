package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{

	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	// Getters and Setters
	public Color getColor() {
		return color;
	}
	
	// Busca se existe oponente na posição desejada
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		
		return p != null && p.getColor() != color;
	}
}
