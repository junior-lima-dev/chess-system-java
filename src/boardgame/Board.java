package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	// Getters and Setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// Methods
	
	// M�todos de retorno da posi��o das pe�as
	public Piece piece(int row, int column) {
		return this.pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return this.pieces[position.getRow()][position.getColumn()];
	}
	
	// M�todo para colocar a pe�a no tabuleiro
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; 
	}
}
