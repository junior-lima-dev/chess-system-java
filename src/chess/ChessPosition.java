package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h'|| row < 1 || row > 8) {
			throw new ChessException("Error instantiating a ChessPostion. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	// Getters and Setters
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	// Methods
	
	// Converter para posição de matriz. A["i"]["j"] , onde i e j são as posições de xadrez convertidas
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// Instancia uma nova posição de xadrez. a1, h8 etc.
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
