package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] piaces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.piaces = new Piece[rows][columns];
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
	public Piece piece(int row, int column) {
		return this.piaces[row][column];
	}
	
	public Piece piece(Position position) {
		return this.piaces[position.getRow()][position.getColumn()];
	}
}
