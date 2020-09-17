package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; // Representa a crição da peça que não está no tabuleiro (Null).
	}

	// Método protegido pois ele não pode ser visível, com exceção apenas das classes no mesmo pacote ou subclasses
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	// Irá buscar alguma implementação do método possibleMoves nas subclasse de Piece
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
