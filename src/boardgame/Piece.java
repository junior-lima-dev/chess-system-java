package boardgame;

public class Piece {

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
	
	
	
	
}
