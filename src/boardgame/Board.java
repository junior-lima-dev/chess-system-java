package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	// Getters and Setters
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	// Methods
	
	// Métodos de retorno da posição das peças
	public Piece piece(int row, int column) {
		if(!positionExist(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExist(position)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[position.getRow()][position.getColumn()];
	}
	
	// Método para colocar a peça no tabuleiro
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; 
	}
	
	// Verificar as existencia das posições
	public boolean positionExist(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExist(Position position) {
		return positionExist(position.getRow(), position.getColumn());
	}
	
	// Verifica a existência da peça
	public boolean thereIsAPiece(Position position) {
		if(!positionExist(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
