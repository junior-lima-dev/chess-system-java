package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; // Representa a cri��o da pe�a que n�o est� no tabuleiro (Null).
	}

	// M�todo protegido pois ele n�o pode ser vis�vel, com exce��o apenas das classes no mesmo pacote ou subclasses
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	// Ir� buscar alguma implementa��o do m�todo possibleMoves nas subclasse de Piece
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
